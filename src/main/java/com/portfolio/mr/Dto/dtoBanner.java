/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mr.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Usuario
 */
public class dtoBanner {

    @NotBlank
    private String img;

    public dtoBanner() {
    }

    public dtoBanner(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
