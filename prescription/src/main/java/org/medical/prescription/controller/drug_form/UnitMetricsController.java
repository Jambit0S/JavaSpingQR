package org.medical.prescription.controller.drug_form;

import org.medical.prescription.domain.drug_form.MedicalForm;
import org.medical.prescription.domain.drug_form.UnitMetrics;
import org.medical.prescription.repo.drug_form.MedicalFormRepo;
import org.medical.prescription.repo.drug_form.UnitMetricsRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("unit-metrics")
public class UnitMetricsController {
    private final UnitMetricsRepo unitMetricsRepo;

    public UnitMetricsController(UnitMetricsRepo unitMetricsRepo) {
        this.unitMetricsRepo = unitMetricsRepo;
    }

    @GetMapping
    public List<UnitMetrics> getListUnitMetrics(){return unitMetricsRepo.findAll();}

    @GetMapping("{id}")
    public UnitMetrics getOneUnitMetrics(@PathVariable("id") UnitMetrics unitMetrics)
    {
        return unitMetrics;
    }

}

