package org.medical.prescription.repo.drug_form;

import org.medical.prescription.domain.drug_form.MedicalForm;
import org.medical.prescription.domain.drug_form.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepo extends JpaRepository<Unit,Integer> {
}
