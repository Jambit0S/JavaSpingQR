package org.medical.prescription.controller.mkb;

import org.medical.prescription.domain.mkb.MkbDotCode;
import org.medical.prescription.repo.mkb.MkbDotCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mkb-dot-code")
public class MkbDotCodeController {
    private final MkbDotCodeRepo mkbDotCodeRepo;
    @Autowired
    public MkbDotCodeController(MkbDotCodeRepo mkbDotCodeRepo){this.mkbDotCodeRepo = mkbDotCodeRepo;}

    @GetMapping
    public List<MkbDotCode> getMKBDotCode(){return mkbDotCodeRepo.findAll();}
    @GetMapping("{id}")
    public MkbDotCode getOneMKBDotCode(@PathVariable("id") MkbDotCode mkbDotCodeRepo){
        return mkbDotCodeRepo;
    }
    @GetMapping("name/{name}")
    public List<MkbDotCode> getListMKBDotCodeByName(@PathVariable("name") String name) {
        return mkbDotCodeRepo.findMKBDotCodeByName(name);
        //return mkbDotCodeRepo.findAll();
    }

}
