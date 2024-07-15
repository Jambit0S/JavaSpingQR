package org.medical.prescription.validation;

import org.medical.prescription.domain.prescription.Prescription;

public class PrescriptionValidate extends Prescription {

    private Prescription prescription;

    public PrescriptionValidate(Prescription prescription) {
        this.prescription = prescription;
    }

    public Prescription getPrescription() {
        prescription.setNumber_prescription("107");

        if(!prescription.getIs_benefit() && prescription.getIs_child())
            prescription.setIs_benefit(true);

        if(prescription.getIs_narcotic()) {
            prescription.setNumber_prescription("148");
            prescription.setIs_benefit(true);
        }


        if(prescription.getIs_benefit())
            prescription.setNumber_prescription(prescription.getNumber_prescription()+"у");

        System.out.println(prescription);

        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }



}
