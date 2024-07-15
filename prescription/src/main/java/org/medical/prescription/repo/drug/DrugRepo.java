package org.medical.prescription.repo.drug;

import org.medical.prescription.domain.drug.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DrugRepo extends JpaRepository<Drug,Integer> {

    @Query(value = "SELECT * FROM drug \n" +
            "WHERE \n" +
            "\t(drug.chemical_name LIKE (?1%))\n" +
            "OR\n" +
            "\t(drug.mnm LIKE (?1%))\n",nativeQuery = true)
    List<Drug> findDrugByName(String name);

}
