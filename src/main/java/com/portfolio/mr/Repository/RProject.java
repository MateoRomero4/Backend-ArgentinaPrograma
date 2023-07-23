/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mr.Repository;

import com.portfolio.mr.Entity.Project;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProject extends JpaRepository<Project, Integer>{
    public Optional<Project> findByNameE(String nameE);
    public boolean existsByNameE(String nameE);
}
