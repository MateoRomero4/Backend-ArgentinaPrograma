/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portfolio.mr.Controller;

import com.Portfolio.mr.security.controller.Mensaje;
import com.Portfolio.mr.Dto.dtoProject;
import com.Portfolio.mr.Entity.Project;
import com.Portfolio.mr.Service.Sproject;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = {"https://frontend-portfoliomr.web.app","http://localhost:4200"})
public class CProject {
    @Autowired
    Sproject sProject;
    
    @GetMapping("/list")
    public ResponseEntity<List<Project>> list(){
        List<Project> list = sProject.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Project> getById(@PathVariable("id")int id){
        if(!sProject.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Project project = sProject.getOne(id).get();
        return new ResponseEntity(project, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sProject.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sProject.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProject dtoproject){
        if(StringUtils.isBlank(dtoproject.getNameE())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sProject.existsByNameE(dtoproject.getNameE())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Project project = new Project(
                dtoproject.getNameE(), dtoproject.getDescriptionE()
            );
        sProject.save(project);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProject dtoproject){
        if(!sProject.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sProject.existsByNameE(dtoproject.getNameE()) && sProject.getByNameE(dtoproject.getNameE()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoproject.getNameE())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        Project project = sProject.getOne(id).get();
        
        project.setNameE(dtoproject.getNameE());
        project.setDescriptionE(dtoproject.getDescriptionE());
        
        sProject.save(project);
        
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }
}
