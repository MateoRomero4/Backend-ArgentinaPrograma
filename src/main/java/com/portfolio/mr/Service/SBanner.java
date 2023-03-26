package com.portfolio.mr.Service;

import com.portfolio.mr.Entity.Banner;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mr.Repository.RBanner;

@Service
@Transactional
public class SBanner {

    @Autowired
    RBanner rbanner;
    
    public List<Banner> list(){
         return rbanner.findAll();
     }
     
     public Optional<Banner> getOne(int id){
         return rbanner.findById(id);
     }
     
     public void save(Banner banner){
         rbanner.save(banner);
     }
     
     public void delete(int id){
         rbanner.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rbanner.existsById(id);
     }
}
