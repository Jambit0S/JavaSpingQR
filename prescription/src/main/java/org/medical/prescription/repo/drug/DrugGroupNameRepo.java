package org.medical.prescription.repo.drug;

import org.medical.prescription.domain.drug.DrugGroupName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugGroupNameRepo extends JpaRepository<DrugGroupName,Integer> {

}
