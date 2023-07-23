package com.portfolio.mr.security.Service;

import com.portfolio.mr.security.entity.User;
import com.portfolio.mr.security.repository.IUserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class UserService {
    @Autowired
    IUserRepository iuserRepository;
    
    public Optional<User> getByUsername(String username){
        return iuserRepository.findByUsername(username);
    }
    
    public boolean existsByUsername(String username){
        return iuserRepository.existsByUsername(username);
    }
    
    public boolean existsByEmail(String email){
        return iuserRepository.existsByEmail(email);
    }
    
    public void save(User user){
        iuserRepository.save(user);
    }
}
