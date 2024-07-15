package org.medical.prescription.repo.patient;

import org.medical.prescription.domain.patient.RecordsOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordsOrderRepo extends JpaRepository<RecordsOrder,Integer> {
}
