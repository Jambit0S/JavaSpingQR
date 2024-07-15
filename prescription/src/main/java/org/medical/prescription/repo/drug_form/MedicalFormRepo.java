package org.medical.prescription.repo.drug_form;

import org.medical.prescription.domain.drug_form.MedicalForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalFormRepo extends JpaRepository<MedicalForm,Integer> {
}
