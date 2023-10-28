
package com.jmao.Veterinaria.Controller;

import com.jmao.Veterinaria.dto.MascotaDTO;
import com.jmao.Veterinaria.model.Duenio;
import com.jmao.Veterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
   @Autowired
   IDuenioService duenioSrv;
    
   //Crear duenio:
   @PostMapping("/duenios/crear")
   public String crearDuenio(@RequestBody Duenio due){
       duenioSrv.saveDuenio(due);
       return "el duenio: "+due.getNombre()+" "+due.getApellido()+", se creo correctamente";
   }
    
   //Leer Duenios:
   @GetMapping("/duenios")
   public List<Duenio> traerDuenios(){
      List<Duenio> listaDuenios = duenioSrv.getsDuenios();
      return listaDuenios;
   }
    
   //Borrar Duenios:
   @DeleteMapping("/duenios/borrar/{id}")
   public String borrarDuenio(@PathVariable Long id){
       duenioSrv.deleteDuenio(id);
       return "el dueno con id n°: "+id+" se borro correctamente";
   }
   
   //Editar duenio:
   @PutMapping("/duenios/editar/{id}")
   public String editarDuenio(@PathVariable Long id,
                              @RequestBody Duenio due){
       duenioSrv.editDuenio(due);
       return "el duenio se actualizo correctamente";
   }
   
   //TRAER LISTA COMBINADA:
   @GetMapping("/duenios/mascotas")
   public List<MascotaDTO> traerDueniosMascotas(){
       
       return duenioSrv.MascoDuenio();
  
    }
   
   
   
 }
