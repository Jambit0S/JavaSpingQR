package org.medical.prescription.controller.prescription;

import org.medical.prescription.domain.prescription.Duration;
import org.medical.prescription.domain.prescription.PrescriptionStatus;
import org.medical.prescription.repo.prescription.DurationRepo;
import org.medical.prescription.repo.prescription.PrescriptionStatusRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("prescription-status")
public class PrescriptionStatusController {
    public PrescriptionStatusController(PrescriptionStatusRepo prescriptionStatusRepo) {
        this.prescriptionStatusRepo = prescriptionStatusRepo;
    }

    private final PrescriptionStatusRepo prescriptionStatusRepo;

    @GetMapping
    public List<PrescriptionStatus> getListPrescriptionStatus(){return prescriptionStatusRepo.findAll();}

    @GetMapping("{id}")
    public PrescriptionStatus getOnePrescriptionStatus(@PathVariable("id") PrescriptionStatus prescriptionStatus)
    {
        return prescriptionStatus;
    }

}
