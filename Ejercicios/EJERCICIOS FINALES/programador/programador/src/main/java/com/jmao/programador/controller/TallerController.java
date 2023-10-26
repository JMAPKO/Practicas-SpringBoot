
package com.jmao.programador.controller;

import com.jmao.programador.model.Taller;
import com.jmao.programador.service.ITallerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TallerController {
    
   @Autowired
   ITallerService tallSrv;
   
   //Crear Curso
   @PostMapping ("/talleres/crear")
   public String crearTaller (@RequestBody Taller tall){
       tallSrv.saveTaller(tall);
       return "el Curso: "+tall.getNombre()+", se guardo correctamente";
   }
   
   //Editar Cursos
   @PutMapping("/talleres/editar")
   public String editTaller (@RequestBody Taller tall){
       tallSrv.editTalleres(tall);
       tallSrv.findTaller(tall.getId());
       return "el curso se edito correctamente";
      
    }
    
   @GetMapping("/talleres")
   public List<Taller> traerTalleres(){
       return tallSrv.getTalleres();
   }
   
   @GetMapping("/talleres/{id}")
   public Taller traerTalleres(@PathVariable Long id){
       return tallSrv.findTaller(id);
   }
   
   //Mostrar solo cursos con java
   @GetMapping ("/talleres/java")
   public List<Taller> traerTalleresConJava(){
       return tallSrv.getTalleresJava();
   }
  
   
 }
