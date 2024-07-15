package org.medical.prescription.controller.prescription;

import org.medical.prescription.domain.prescription.Duration;
import org.medical.prescription.domain.prescription.Prescription;
import org.medical.prescription.repo.prescription.DurationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("duration")
public class DurationController {

    @Autowired
    private RestTemplate restTemplate;

    public DurationController(DurationRepo durationRepo) {
        this.durationRepo = durationRepo;
    }

    private final DurationRepo durationRepo;

    @GetMapping
    public List<Duration> getDurations(){return durationRepo.findAll();}

    @GetMapping("{id}")
    public Duration getOneDuration(@PathVariable("id") Duration duration)
    {
        return duration;
    }

    @GetMapping("/today")
    public String getTodayDate(){
        return durationRepo.findTodayDate();
    }
    @GetMapping("/end-duration/{id}")
    public String getEndDate(@PathVariable("id") Duration duration){
        //return duration.getDays().toString();
        return durationRepo.findEndPrescriptionDate(duration.getDays());
    }

}
