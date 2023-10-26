
package com.JMAO.practicaUnoJpa.controller;

import com.JMAO.practicaUnoJpa.model.Mascota;
import com.JMAO.practicaUnoJpa.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mascotaController {
   @Autowired
   private MascotaService mascoServ;
   
    
   @PostMapping ("/mascota/crear")
   public String guardarMascota(@RequestBody Mascota masco){
      mascoServ.guardarMascota(masco);
      return "la mascota: "+ masco.getNombre()+", se guardo con exito";
   }
    
 }
