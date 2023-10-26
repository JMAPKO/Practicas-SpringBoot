
package com.jmao.programador.controller;

import com.jmao.programador.model.Contenido;
import com.jmao.programador.service.IContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContenidoController {
   @Autowired
   IContenidoService contSrv;
   
   //CREAR TEMA
   @PostMapping("/temas/crear")
   public String crearTema(@RequestBody Contenido cont){
       contSrv.saveContenido(cont);
       return "el tema: "+cont.getNombre()+", fue guardado exitosamente";
   }
    
   @PutMapping("/temas/editar/{id}")
   public String editTaller (@PathVariable int id, @RequestBody Contenido cont){
       contSrv.editarTema(cont);
       contSrv.traerTema(cont.getId_tema());
       return "el tema:"+cont.getNombre()+", se edito correctamente";
      
    }
    
 } 
