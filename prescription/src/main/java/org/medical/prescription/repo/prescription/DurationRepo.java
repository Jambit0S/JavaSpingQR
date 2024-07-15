package org.medical.prescription.repo.prescription;

import org.medical.prescription.domain.prescription.Duration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DurationRepo extends JpaRepository<Duration,Integer> {
    //SELECT CURRENT_DATE;
    @Query(value = "SELECT CURRENT_DATE",nativeQuery = true)
    String findTodayDate();

    @Query(value = "SELECT CURRENT_DATE + ?1",nativeQuery = true)
    String findEndPrescriptionDate(Integer days);
}
