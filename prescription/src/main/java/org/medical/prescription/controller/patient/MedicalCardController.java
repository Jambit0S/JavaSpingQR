package org.medical.prescription.controller.patient;

import org.medical.prescription.domain.patient.Benefit;
import org.medical.prescription.domain.patient.MedicalCard;
import org.medical.prescription.repo.patient.BenefitRepo;
import org.medical.prescription.repo.patient.MedicalCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medical-card")
public class MedicalCardController {
    private final MedicalCardRepo medicalCardRepo;
    @Autowired
    public MedicalCardController(MedicalCardRepo medicalCardRepo){this.medicalCardRepo=medicalCardRepo;}

    @GetMapping
    public List<MedicalCard> getMedicalCards(){return medicalCardRepo.findAll();}
    @GetMapping("{id}")
    public MedicalCard getOneMedicalCard(@PathVariable("id") MedicalCard medicalCard){
        return medicalCard;
    }

}
