package org.medical.prescription.repo.prescription;

import org.medical.prescription.domain.prescription.Doctor;
import org.medical.prescription.domain.prescription.PrescriptionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionStatusRepo extends JpaRepository<PrescriptionStatus,Integer> {

}
