package org.medical.prescription.repo.patient;

import org.medical.prescription.domain.patient.Benefit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitRepo extends JpaRepository <Benefit,Integer> {
}
