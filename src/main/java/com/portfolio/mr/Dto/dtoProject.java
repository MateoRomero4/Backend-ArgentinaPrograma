/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portfolio.mr.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProject {
    @NotBlank
    private String nameE;
    @NotBlank
    private String descriptionE;

    public dtoProject() {
    }

    public dtoProject(String nameE, String descriptionE) {
        this.nameE = nameE;
        this.descriptionE = descriptionE;
    }

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
