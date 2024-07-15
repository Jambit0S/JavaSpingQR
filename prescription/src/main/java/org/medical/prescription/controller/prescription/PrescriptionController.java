package org.medical.prescription.controller.prescription;

import org.medical.prescription.domain.drug_form.DrugFormView;
import org.medical.prescription.domain.prescription.Duration;
import org.medical.prescription.domain.prescription.Prescription;
import org.medical.prescription.domain.prescription.PrescriptionStatus;
import org.medical.prescription.repo.prescription.PrescriptionRepo;
import org.medical.prescription.validation.PrescriptionEncryption;
import org.medical.prescription.validation.PrescriptionValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("prescription")
public class PrescriptionController {
    private final PrescriptionRepo prescriptionRepo;

    public PrescriptionController(PrescriptionRepo prescriptionRepo) {
        this.prescriptionRepo = prescriptionRepo;
    }
    @GetMapping
    public List<Prescription> getPrescriptions()
    {
        PrescriptionEncryption encryption= new PrescriptionEncryption();
        return encryption.DeEncrypt(prescriptionRepo.findAll());
    }
    @GetMapping("{id}")
    public Prescription getOnePrescription(@PathVariable("id") Prescription prescription) throws Exception {
        PrescriptionEncryption encryption= new PrescriptionEncryption();
        return encryption.DeEncrypt(prescription);
    }

    @GetMapping("/last/{count}")
    public List<Prescription> getLastPrescriptions(@PathVariable Integer count)
    {
        PrescriptionEncryption encryption= new PrescriptionEncryption();
        List<Prescription> buf = prescriptionRepo.findAll();
        return encryption.DeEncrypt(buf.subList(buf.size()-count,buf.size()));
    }
    @PostMapping()
    public Prescription create(@RequestBody Prescription prescription)
    {
        PrescriptionEncryption encryption= new PrescriptionEncryption();

        PrescriptionValidate validate = new PrescriptionValidate(prescription);
        System.out.println(validate.getQr_code());
        validate.getPrescription().setQr_code(prescription.getIs_electronic_prescription(),UUID.randomUUID().toString());
        System.out.println(validate.getPrescription().getQr_code());
        if(validate.getPrescription().getIs_narcotic())
            validate.getPrescription().setIs_electronic_prescription(false);
        return prescriptionRepo.save(encryption.Encrypt(validate.getPrescription()));
    }
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("qrN/{qrCode}")
    public DrugFormView getDrugFormByQrCode(@PathVariable("qrCode")String qrCode){
        PrescriptionEncryption encrypt = new PrescriptionEncryption();
        Prescription prescription = prescriptionRepo.findPrescriptionByQrCode(encrypt.coding(qrCode)).get(0);
        DrugFormView drugFormView = restTemplate.getForObject("http://localhost:8080/mainstay/drug-form-view/"+prescription.getId_drug_form(), DrugFormView.class);
        return drugFormView;
    }
    @GetMapping("/qr/{qrCode}")
    //public Map<String, Object> get(@PathVariable String qrCode) {
    public Map<String, Object> getPrescriptionByQrCode(@PathVariable("qrCode") String qrCode) {

        PrescriptionEncryption encrypt = new PrescriptionEncryption();
        //List<Prescription> prescriptions = encrypt.DeEncrypt(prescriptionRepo.findPrescriptionByQrCode(encrypt.coding(qrCode)));
        List<String> drugFormViews= prescriptionRepo.findDrugFormByQrCode(encrypt.coding(qrCode));
        Map<String, Object> map = new HashMap<>();

        map.put("Drug", drugFormViews.get(0));
        return map;

    }
    @PostMapping("number")
    public String getNumberOfPrescription(@RequestBody Prescription prescription) { //Validate PrescriptionTo get NUmber
        PrescriptionValidate prescriptionValidate= new PrescriptionValidate(prescription);
        Prescription validatedPrescription = prescriptionValidate.getPrescription();
        return validatedPrescription.getNumber_prescription();
    }
    @GetMapping("endDate/{id}")
    public String getPrescriptionEndDate(@PathVariable("id") Prescription prescription){
        PrescriptionEncryption encrypt = new PrescriptionEncryption();
        Duration duration = restTemplate.getForObject("http://localhost:8080/mainstay/duration/"+prescription.getId_duration(),Duration.class);
        LocalDate localDate = LocalDate.parse(encrypt.decoding(prescription.getCreate_date())).plusDays(duration.getDays());
        return localDate.toString();
        //Prescription prescription = restTemplate.getForObject("http://localhost:8080/mainstay/prescription/"+prescriptionId, Prescription.class);
        //return "asd";
    }
    @GetMapping("status/{id}")
    public String getPrescriptionStatus(@PathVariable("id") Prescription prescription){
        PrescriptionEncryption encrypt = new PrescriptionEncryption();
        PrescriptionStatus prescriptionStatus = restTemplate.getForObject("http://localhost:8080/mainstay/prescription-status/"+prescription.getId_prescription_status(),PrescriptionStatus.class);
        return prescriptionStatus.getName();
    }
}
