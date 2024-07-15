package org.medical.prescription.controller.patient;

import org.medical.prescription.domain.patient.Patient;
import org.medical.prescription.repo.patient.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("patient")
public class PatientController {
    private final PatientRepo patientRepo;
    @Autowired
    public PatientController(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }
    @GetMapping
    public List<Patient> getPatients()
    {
        return patientRepo.findAll();
    }
    @GetMapping("{id}")
    public Patient getOnePatient(@PathVariable("id") Patient patient)
    {
        return patient;
    }
    @GetMapping("child-check/{id}")
    public boolean childCheckPatientById(@PathVariable("id") Patient patient){
        LocalDate date = LocalDate.parse(patient.getDate_birth());
        LocalDate today = LocalDate.now();
        long diff = ChronoUnit.YEARS.between( date , today );
        if(diff>=18)
            return false;
        return true;
    }

    @GetMapping("/first-name/{fname}")
    public List<Patient> getPatientsByFirstName(@PathVariable("fname")String fname)
    {
        return patientRepo.findAll().stream().filter(
                element->element.getFirst_name().equals(fname)
        ).collect(Collectors.toList());
    }

}
