package org.medical.prescription.repo.patient;

import org.medical.prescription.domain.patient.Patient;
import org.medical.prescription.domain.patient.PatientBenefit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientBenefitRepo extends JpaRepository<PatientBenefit,Integer> {
}
