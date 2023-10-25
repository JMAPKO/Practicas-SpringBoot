
package com.JMAO.practicaUnoJpa.controller;

import com.JMAO.practicaUnoJpa.model.Persona;
import com.JMAO.practicaUnoJpa.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class personaController {
    
   @Autowired
   private PersonaService persoServ;
   
   @GetMapping ("/traer")
   public List<Persona> listaPerso(){
      return persoServ.getPersonas();
   }
    
   @PostMapping("/crear")
   public String crearPersona(@RequestBody Persona perso){
       persoServ.savePersona(perso);
       
       return "la persona se guardo con exito";
   }
   
   @DeleteMapping("/persona/borrar/{id}")
   public String deletePersona(@PathVariable Long id){
       persoServ.deletePersona(id);
       return "la persona se elimno correctamente";
   }
   
   @PutMapping("/editar/{id_modificar}")
   public Persona editPersona(@PathVariable Long id_modificar,
                              @RequestParam(required = false, name="id") Long nuevaId,
                              @RequestParam(required = false, name="nombre") String nuevoNombre,
                              @RequestParam(required = false, name="apellido") String nuevoApellido,
                              @RequestParam(required = false, name="edad") int nuevaEdad){
       
       persoServ.editPersona(id_modificar, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
       
       //BUSCARMOS LA PERSONA CON LA NUEVA ID
       Persona perso = persoServ.findPersona(nuevaId);
       
       //LO GUARDAMOS EN EL METODO
       return perso;
       
    }
   
   
    
 }
