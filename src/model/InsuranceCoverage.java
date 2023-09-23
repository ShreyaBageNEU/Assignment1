/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Shreya Bage
 */
public class InsuranceCoverage {
    
    private String CorpID;
    private String address;
    private String premium;
    private String deductable;
    private String textStatement;

    public String getCorpID() {
        return CorpID;
    }

    public void setCorpID(String CorpID) {
        this.CorpID = CorpID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDeductable() {
        return deductable;
    }

    public void setDeductable(String deductable) {
        this.deductable = deductable;
    }

    public String getTextStatement() {
        return textStatement;
    }

    public void setTextStatement(String textStatement) {
        this.textStatement = textStatement;
    }
    
    
    
}
