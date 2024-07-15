package org.medical.prescription.controller.drug_form;

import org.medical.prescription.domain.drug_form.DrugInsertion;
import org.medical.prescription.domain.drug_form.MedicalForm;
import org.medical.prescription.repo.drug_form.DrugInsertionRepo;
import org.medical.prescription.repo.drug_form.MedicalFormRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medical-form")
public class MedicalFormController {
    private final MedicalFormRepo medicalFormRepo;

    public MedicalFormController(MedicalFormRepo medicalFormRepo) {
        this.medicalFormRepo = medicalFormRepo;
    }

    @GetMapping
    public List<MedicalForm> getMedicalForms(){return medicalFormRepo.findAll();}

    @GetMapping("{id}")
    public MedicalForm getOneMedicalForm(@PathVariable("id") MedicalForm medicalForm)
    {
        return medicalForm;
    }

}

