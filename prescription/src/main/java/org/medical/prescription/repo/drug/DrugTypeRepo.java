package org.medical.prescription.repo.drug;

import org.medical.prescription.domain.drug.DrugGroupName;
import org.medical.prescription.domain.drug.DrugType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugTypeRepo extends JpaRepository<DrugType,Integer> {

}
