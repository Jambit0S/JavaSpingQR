package org.medical.prescription.repo.drug;

import org.medical.prescription.domain.drug.Drug;
import org.medical.prescription.domain.drug.DrugGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugGroupRepo extends JpaRepository<DrugGroup,Integer> {
}
