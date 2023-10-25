
package com.JMAO.utilizando.Autowired.controller;

import com.JMAO.utilizando.Autowired.model.Posteo;
import com.JMAO.utilizando.Autowired.repository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   @Autowired
   IPosteoRepository repo;
    
   @GetMapping("/posteos")
   public List<Posteo> mostrarPosts(){
       return repo.traerPosteos();
   }
    
}
