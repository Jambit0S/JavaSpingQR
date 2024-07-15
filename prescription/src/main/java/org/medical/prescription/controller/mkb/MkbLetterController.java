package org.medical.prescription.controller.mkb;

import org.medical.prescription.domain.mkb.MkbLetter;
import org.medical.prescription.repo.mkb.MkbLetterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mkb-letter")
public class MkbLetterController {
    private final MkbLetterRepo mkbLetterRepo;
    @Autowired
    public MkbLetterController(MkbLetterRepo mkbLetterRepo){this.mkbLetterRepo = mkbLetterRepo;}

    @GetMapping
    public List<MkbLetter> getMKBLetter(){return mkbLetterRepo.findAll();}
    @GetMapping("{id}")
    public MkbLetter getOneMKBLetter(@PathVariable("id") MkbLetter mkbLetter){
        return mkbLetter;
    }

}
