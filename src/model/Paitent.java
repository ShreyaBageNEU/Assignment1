/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Shreya Bage
 */
public class Paitent {
    
    private String paitentid;
    private String primarydoctor;
    private String lastvisit;
    private String nextappointment;
    private String allergies;
    private String onMedication;
    private String insuranceCoverage;

    public String getPaitentid() {
        return paitentid;
    }

    public void setPaitentid(String paitentid) {
        this.paitentid = paitentid;
    }

    public String getPrimarydoctor() {
        return primarydoctor;
    }

    public void setPrimarydoctor(String primarydoctor) {
        this.primarydoctor = primarydoctor;
    }

    public String getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit;
    }

    public String getNextappointment() {
        return nextappointment;
    }

    public void setNextappointment(String nextappointment) {
        this.nextappointment = nextappointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }

    public String getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(String insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }
    
    
}
