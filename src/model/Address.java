/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Shreya Bage
 */
public class Address {
    
    private String GPSlocation;
    private String city;
    private String state;
    private String country;
    
    public String getGPSlocation(){
        return GPSlocation;
    
}
    
    public void setGPSlocation(String GPSlocation){
        this.GPSlocation = GPSlocation;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setcity(){
        this.city = city;
    }
    
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
}
