package org.medical.prescription.controller.mkb;

import org.medical.prescription.domain.mkb.MkbView;
import org.medical.prescription.repo.mkb.MkbViewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mkb-view")
public class MkbViewController {
    private final MkbViewRepo mkbViewRepo;
    @Autowired
    public MkbViewController(MkbViewRepo mkbDotCodeRepo){this.mkbViewRepo = mkbDotCodeRepo;}

    @GetMapping
    public List<MkbView> getMKBDotCode(){return mkbViewRepo.findAll();}
    @GetMapping("{id}")
    public MkbView getOneMKBDotCode(@PathVariable("id") MkbView mkbDotCodeRepo){
        return mkbDotCodeRepo;
    }


}
