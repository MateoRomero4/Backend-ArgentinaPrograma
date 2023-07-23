
package com.portfolio.mr.Controller;

import com.portfolio.mr.security.controller.Mensaje;
import com.portfolio.mr.Dto.dtoBanner;
import com.portfolio.mr.Entity.Banner;
import com.portfolio.mr.Service.SBanner;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
@CrossOrigin(origins = {"https://frontend-portfoliomr.web.app","http://localhost:4200"})
public class CBanner {
    @Autowired
    SBanner bannerService;
    
    @GetMapping("/list")
    public ResponseEntity<List<Banner>> list(){
        List<Banner> list = bannerService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id")int id){
        if(!bannerService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Banner banner = bannerService.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity createBanner(@RequestBody Banner banner){
        bannerService.save(banner);
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoBanner dtobanner){
        if(!bannerService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        
        Banner banner = bannerService.getOne(id).get();
        
        banner.setImg(dtobanner.getImg());
        
        bannerService.save(banner);
        
        return new ResponseEntity(new Mensaje("Banner actualizado"), HttpStatus.OK);
    }
   
}
