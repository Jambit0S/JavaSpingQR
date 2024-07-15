package org.medical.prescription.repo.mkb;

import org.medical.prescription.domain.mkb.MkbCode;
import org.medical.prescription.domain.mkb.MkbLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MkbCodeRepo extends JpaRepository <MkbCode,Integer> {
}
