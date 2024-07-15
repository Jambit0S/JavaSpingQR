package org.medical.prescription.controller.patient;

import org.medical.prescription.domain.patient.Benefit;
import org.medical.prescription.repo.patient.BenefitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("benefit")
public class BenefitController {
    private final BenefitRepo benefitRepo;
    @Autowired
    public BenefitController(BenefitRepo benefitRepo){this.benefitRepo=benefitRepo;}

    @GetMapping
    public List<Benefit> getBenefits(){return benefitRepo.findAll();}
    @GetMapping("{id}")
    public Benefit getOneBenefit(@PathVariable("id") Benefit benefit){
        return benefit;
    }
}
