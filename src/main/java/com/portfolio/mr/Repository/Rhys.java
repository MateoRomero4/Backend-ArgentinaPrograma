/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portfolio.mr.Repository;

import com.Portfolio.mr.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys> findByName(String name);
    public boolean existsByName(String name);
}
