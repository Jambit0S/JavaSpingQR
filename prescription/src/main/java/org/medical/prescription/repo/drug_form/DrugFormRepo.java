package org.medical.prescription.repo.drug_form;

import org.medical.prescription.domain.drug_form.DrugForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugFormRepo extends JpaRepository<DrugForm,Integer> {
}
