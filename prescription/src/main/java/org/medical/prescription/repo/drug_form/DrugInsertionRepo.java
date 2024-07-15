package org.medical.prescription.repo.drug_form;

import org.medical.prescription.domain.drug_form.DrugInsertion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugInsertionRepo extends JpaRepository<DrugInsertion,Integer> {
}
