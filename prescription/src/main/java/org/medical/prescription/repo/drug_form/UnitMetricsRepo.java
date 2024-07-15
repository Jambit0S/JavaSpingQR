package org.medical.prescription.repo.drug_form;

import org.medical.prescription.domain.drug_form.Unit;
import org.medical.prescription.domain.drug_form.UnitMetrics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitMetricsRepo extends JpaRepository<UnitMetrics,Integer> {
}
