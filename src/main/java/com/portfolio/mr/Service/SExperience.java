/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mr.Service;

import com.portfolio.mr.Entity.Experience;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mr.Repository.RExperience;

@Service
@Transactional
public class SExperience {
     @Autowired
     RExperience rExperience;
     
     public List<Experience> list(){
         return rExperience.findAll();
     }
     
     public Optional<Experience> getOne(int id){
         return rExperience.findById(id);
     }
     
     public Optional<Experience> getByNameE(String nameE){
         return rExperience.findByNameE(nameE);
     }
     
     public void save(Experience expe){
         rExperience.save(expe);
     }
     
     public void delete(int id){
         rExperience.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rExperience.existsById(id);
     }
     
     public boolean existsByNameE(String nameE){
         return rExperience.existsByNameE(nameE);
     }
}
