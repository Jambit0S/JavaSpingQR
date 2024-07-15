package org.medical.prescription.repo.prescription;

import org.medical.prescription.domain.prescription.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrescriptionRepo extends JpaRepository<Prescription,Integer> {

    @Query(value = "SELECT * FROM prescription WHERE qr_code= (?1)",nativeQuery = true)
    List<Prescription> findPrescriptionByQrCode(String qrCode);

    @Query(value = "SELECT * " +
            "FROM drug_form_view WHERE drug_form_view.id = "+
            "(SELECT drug_form_view.id FROM drug_form_view "+
            "INNER JOIN prescription ON "+
            "drug_form_view.id = prescription.id_drug_form "+
            "WHERE prescription.qr_code=(?1))",nativeQuery = true)
    List<String> findDrugFormByQrCode(String qrCode);

}
