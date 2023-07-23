/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portfolio.mr.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperience {
    @NotBlank
    private String nameE;
    @NotBlank
    private String descriptionE;
    
    //Constructores

    public dtoExperience() {
    }

    public dtoExperience(String nameE, String descriptionE) {
        this.nameE = nameE;
        this.descriptionE = descriptionE;
    }
    //Getters & Setters

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getDescriptionE() {
        return descriptionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descriptionE = descriptionE;
    }
    
}
