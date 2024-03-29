package com.portfolio.mr.security.Service;

import com.portfolio.mr.security.entity.Role;
import com.portfolio.mr.security.enums.RoleName;
import com.portfolio.mr.security.repository.IRoleRepository;
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