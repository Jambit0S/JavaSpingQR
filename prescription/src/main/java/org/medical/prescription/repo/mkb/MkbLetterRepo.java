package org.medical.prescription.repo.mkb;

import org.medical.prescription.domain.mkb.MkbLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MkbLetterRepo extends JpaRepository <MkbLetter,Integer> {
}
