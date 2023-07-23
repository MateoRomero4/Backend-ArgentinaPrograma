/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portfolio.mr.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String name;
    @NotBlank
    private int percentage;

    public dtoHys() {
    }

    public dtoHys(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    
    
}
