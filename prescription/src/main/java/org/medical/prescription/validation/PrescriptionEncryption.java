package org.medical.prescription.validation;

import org.medical.prescription.domain.prescription.Prescription;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionEncryption {

    public Prescription DeEncrypt(Prescription nonEncrypt)
    {
        Prescription encrypt= new Prescription(
                decoding(nonEncrypt.getId()),
                decoding(nonEncrypt.getId_doctor()),
                decoding(nonEncrypt.getId_patient()),
                decoding(nonEncrypt.getId_drug_form()),
                decoding(nonEncrypt.getId_prescription_status()),
                decoding(nonEncrypt.getId_duration()),
                decoding(nonEncrypt.getId_mkb_dot_code()),

                nonEncrypt.getIs_benefit(),
                nonEncrypt.getIs_narcotic(),
                nonEncrypt.getIs_child(),
                nonEncrypt.getIs_electronic_prescription(),
                nonEncrypt.getIs_cito(),

                decoding(nonEncrypt.getNumber_prescription()),
                decoding(nonEncrypt.getCreate_date()),
                decoding(nonEncrypt.getCount_day()),
                decoding(nonEncrypt.getAddress_patient()),
                decoding(nonEncrypt.getQr_code()),
                decoding(nonEncrypt.getId_patient_benefit()),
                decoding(nonEncrypt.getUsability()),
                decoding(nonEncrypt.getSign())
        );
        return encrypt;
    }
    public List<Prescription> DeEncrypt(List<Prescription> nonEncrypt)
    {
        List<Prescription> encrypt= new ArrayList<>();

        for (Prescription prescription:nonEncrypt) {
            encrypt.add(DeEncrypt(prescription));
        }
        return encrypt;
    }

    public Prescription Encrypt(Prescription nonEncrypt)
    {
        Prescription encrypt= new Prescription(
                coding(nonEncrypt.getId()),
                coding(nonEncrypt.getId_doctor()),
                coding(nonEncrypt.getId_patient()),
                coding(nonEncrypt.getId_drug_form()),
                coding(nonEncrypt.getId_prescription_status()),
                coding(nonEncrypt.getId_duration()),
                coding(nonEncrypt.getId_mkb_dot_code()),

                nonEncrypt.getIs_benefit(),
                nonEncrypt.getIs_narcotic(),
                nonEncrypt.getIs_child(),
                nonEncrypt.getIs_electronic_prescription(),
                nonEncrypt.getIs_cito(),

                coding(nonEncrypt.getNumber_prescription()),
                coding(nonEncrypt.getCreate_date()),
                coding(nonEncrypt.getCount_day()),
                coding(nonEncrypt.getAddress_patient()),
                coding(nonEncrypt.getQr_code()),
                coding(nonEncrypt.getId_patient_benefit()),
                coding(nonEncrypt.getUsability()),
                coding(nonEncrypt.getSign())
        );
        return encrypt;
    }
    public List<Prescription> Encrypt(List<Prescription> nonEncrypt)
    {
        List<Prescription> encrypt= new ArrayList<>();

        for (Prescription prescription:nonEncrypt) {
            encrypt.add(Encrypt(prescription));
        }
        return encrypt;
    }

    public String coding(String text)
    {
        String result=null;
        if(text !=null)
            result="ШИФР"+text;//Шифр закл в слова шифр
        return result;
    }

    public String decoding(String text) {
        String result=null;
        if(text !=null)
            result = text.substring(4);//Шифр закл в слова шифр
        return result;
    }
    public Integer coding(Integer value)
    {
        return value;
    }
    public Integer decoding(Integer value)
    {
        return value;
    }
    //No boolean
    //no sense to code and decode
}
