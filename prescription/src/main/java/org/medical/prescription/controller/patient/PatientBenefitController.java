package org.medical.prescription.controller.patient;

import org.medical.prescription.domain.patient.Benefit;
import org.medical.prescription.domain.patient.PatientBenefit;
import org.medical.prescription.domain.prescription.Prescription;
import org.medical.prescription.repo.patient.PatientBenefitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("patient-benefit")
public class PatientBenefitController {
    private final PatientBenefitRepo patientBenefitRepo;
    @Autowired
    public PatientBenefitController(PatientBenefitRepo patientBenefitRepo) {
        this.patientBenefitRepo = patientBenefitRepo;
    }
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping
    public List<PatientBenefit> getPatientBenefits()
    {
        return patientBenefitRepo.findAll();
    }
    @GetMapping("{id}")
    public PatientBenefit getOnePatientBenefit(@PathVariable("id") PatientBenefit patientBenefit)
    {
        return patientBenefit;
    }

    @GetMapping("/benefits/{id_patient}")
    public List<Benefit> getBenefitsByIdPatient(@PathVariable("id_patient") int id_patient)
    {
        List<Benefit> benefits= new ArrayList<Benefit>();
        List<PatientBenefit> patientBenefits = patientBenefitRepo.findAll().stream().
                filter(element->element.getId_patient().equals(id_patient) &&
                        (LocalDate.parse(element.getEnd_date()).compareTo(LocalDate.now().minusDays(1)))>0
                ).collect(Collectors.toList());
        benefits.add(this.restTemplate.getForObject("http://localhost:8080/mainstay/benefit/1",Benefit.class));
        for (PatientBenefit patBen:patientBenefits) {
            benefits.add(this.restTemplate.getForObject("http://localhost:8080/mainstay/benefit/"+patBen.getId_benefit(),Benefit.class));
        }
        return benefits;
    }
    @GetMapping("/patient-benefits/{id_patient}")
    public List<PatientBenefit> getPatientBenefitsByIdPatient(@PathVariable("id_patient") int id_patient)
    {
        return patientBenefitRepo.findAll().stream().
                filter(element->element.getId_patient().equals(id_patient) &&
                        (LocalDate.parse(element.getEnd_date()).compareTo(LocalDate.now().minusDays(1)))>0
                ).collect(Collectors.toList());
    }
    @GetMapping("prescription/{id_prescription}")
    public String getBenefitByPrescription(@PathVariable("id_prescription")int id_prescr)
    {
        System.out.println(id_prescr);
        Prescription peekPrescription = this.restTemplate.getForObject("http://localhost:8080/mainstay/prescription/"+id_prescr, Prescription.class);
        System.out.println(peekPrescription.getId_patient_benefit());
        Benefit ben = (restTemplate.getForObject("http://localhost:8080/mainstay/benefit/"+peekPrescription.getId_patient_benefit(),Benefit.class));
        System.out.println(ben.getName());
        return ben.getName();
    }
}
