package org.medical.prescription.repo.patient;

import org.medical.prescription.domain.patient.Benefit;
import org.medical.prescription.domain.patient.MedicalCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalCardRepo extends JpaRepository <MedicalCard,Integer> {
}
