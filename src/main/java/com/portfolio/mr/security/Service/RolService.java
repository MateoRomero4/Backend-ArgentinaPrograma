package com.Portfolio.mr.security.Service;

import com.Portfolio.mr.security.entity.Role;
import com.Portfolio.mr.security.enums.RoleName;
import com.Portfolio.mr.security.repository.IRoleRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired
    IRoleRepository iroleRepository;
    
    public Optional<Role> getByRoleName(RoleName roleName){
        return iroleRepository.findByRoleName(roleName);
    }
    
    public void save(Role role){
        iroleRepository.save(role);
    }
}