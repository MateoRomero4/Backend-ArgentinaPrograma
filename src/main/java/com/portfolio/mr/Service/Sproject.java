/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mr.Service;

import com.portfolio.mr.Entity.Project;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mr.Repository.RProject;

@Service
@Transactional
public class Sproject {
    @Autowired
    RProject rProject;
    
    public List<Project> list(){
        return rProject.findAll();
    }
    
    public Optional<Project> getOne(int id){
        return rProject.findById(id);
    }
    
    public Optional<Project> getByNameE(String nameE){
        return rProject.findByNameE(nameE);
    }
    
    public void save(Project education){
        rProject.save(education);
    }
    
    public void delete(int id){
        rProject.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProject.existsById(id);
    }
    
    public boolean existsByNameE(String nameE){
        return rProject.existsByNameE(nameE);
    }
}
