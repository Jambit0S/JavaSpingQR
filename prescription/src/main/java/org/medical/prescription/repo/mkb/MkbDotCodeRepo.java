package org.medical.prescription.repo.mkb;

import org.medical.prescription.domain.mkb.MkbDotCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MkbDotCodeRepo extends JpaRepository <MkbDotCode,Integer> {

    @Query(value = "SELECT * FROM mkb_dot_code WHERE mkb_dot_code.name LIKE (?1%)",nativeQuery = true)
    List<MkbDotCode> findMKBDotCodeByName(String name);

}
