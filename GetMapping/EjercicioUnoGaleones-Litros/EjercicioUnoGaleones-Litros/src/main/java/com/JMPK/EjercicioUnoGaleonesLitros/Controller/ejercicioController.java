
package com.JMPK.EjercicioUnoGaleonesLitros.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejercicioController {
    
   @GetMapping("/convertir/{galones}")
    public String galonesAlitros(@PathVariable double galones){
       //convetimos galones a litros
       double litros = galones * 3.78541;
       return "la cantidad de litros equivalente a: "+galones
               +" Galones, es de: "+litros+ " L"; 
    }   
    
  }
