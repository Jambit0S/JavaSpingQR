package org.medical.prescription.repo.patient;

import org.medical.prescription.domain.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
