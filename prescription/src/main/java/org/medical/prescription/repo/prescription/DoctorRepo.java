package org.medical.prescription.repo.prescription;

import org.medical.prescription.domain.prescription.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DoctorRepo extends JpaRepository<Doctor,Integer> {

}
