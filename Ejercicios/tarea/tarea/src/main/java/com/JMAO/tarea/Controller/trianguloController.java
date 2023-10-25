
package com.JMAO.tarea.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trianguloController {
    
   @GetMapping("/area/{base}/{altura}")
   public String areaTriangulo (@PathVariable double base,
                                @PathVariable double altura){
       
       double area = base*altura/2;
       
       return "el area del triangulo es igual a: "+area;
    }
    
   @GetMapping("/area")
   ResponseEntity<String> respuesta(@RequestParam double base,
                                    @RequestParam double altura){
       
       double area = base*altura/2;
       //propando expectation_Failed
       return new ResponseEntity<>("el valor del area es: "+area,HttpStatus.EXPECTATION_FAILED);
   }
   
  }
