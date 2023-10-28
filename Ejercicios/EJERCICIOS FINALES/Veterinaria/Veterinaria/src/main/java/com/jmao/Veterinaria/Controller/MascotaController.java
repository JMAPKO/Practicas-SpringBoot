
package com.jmao.Veterinaria.Controller;

import com.jmao.Veterinaria.model.Mascota;
import com.jmao.Veterinaria.service.IMascotaService;
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
public class MascotaController {
    
    @Autowired
    IMascotaService mascoSrv;
    
    //Crear duenio:
   @PostMapping("/mascotas/crear")
   public String crearMascota(@RequestBody Mascota masco){
       mascoSrv.saveMascota(masco);
       return "la mascota: "+masco.getNombre()+", se creo correctamente";
   }
    
   //Leer Duenios:
   @GetMapping("/mascotas")
   public List<Mascota> traerMascotas(){
      List<Mascota> listaMascotas = mascoSrv.getsMascotas();
      return listaMascotas;
   }
    
   //Borrar Duenios:
   @DeleteMapping("/mascotas/borrar/{id}")
   public String borrarMascota(@PathVariable Long id){
       mascoSrv.deleteMascota(id);
       return "el dueno con id n°: "+id+" se borro correctamente";
   }
   
   //Editar duenio:
   @PutMapping("/mascotas/editar/{id}")
   public String editarMascota(@PathVariable Long id,
                              @RequestBody Mascota masco){
       mascoSrv.editMascota(masco);
       return "la Mascota se actualizo correctamente";
   }
   
   //TRAER SOLAMENTE CANICHES
   @GetMapping("/mascotas/caniches")
   public List<Mascota> traerCaniches(){
       List<Mascota> listaCanichesToy = mascoSrv.traerCaniches();
       return listaCanichesToy;
   }
   
    
 }
