/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mr.Service;

import com.portfolio.mr.Entity.Education;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mr.Repository.REducation;

@Service
@Transactional
public class Seducation {
    @Autowired
    REducation rEducation;
    
    public List<Education> list(){
        return rEducation.findAll();
    }
    
    public Optional<Education> getOne(int id){
        return rEducation.findById(id);
    }
    
    public Optional<Education> getByNameE(String nameE){
        return rEducation.findByNameE(nameE);
    }
    
    public void save(Education education){
        rEducation.save(education);
    }
    
    public void delete(int id){
        rEducation.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducation.existsById(id);
    }
    
    public boolean existsByNameE(String nameE){
        return rEducation.existsByNameE(nameE);
    }
}
