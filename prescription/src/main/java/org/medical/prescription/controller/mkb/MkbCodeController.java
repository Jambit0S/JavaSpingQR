package org.medical.prescription.controller.mkb;

import org.medical.prescription.domain.mkb.MkbCode;
import org.medical.prescription.domain.mkb.MkbLetter;
import org.medical.prescription.repo.mkb.MkbCodeRepo;
import org.medical.prescription.repo.mkb.MkbLetterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mkb-code")
public class MkbCodeController {
    private final MkbCodeRepo mkbCodeRepo;
    @Autowired
    public MkbCodeController(MkbCodeRepo mkbCodeRepo){this.mkbCodeRepo = mkbCodeRepo;}

    @GetMapping
    public List<MkbCode> getMKBCode(){return mkbCodeRepo.findAll();}
    @GetMapping("{id}")
    public MkbCode getOneMKBCode(@PathVariable("id") MkbCode mkbCode){
        return mkbCode;
    }

}
