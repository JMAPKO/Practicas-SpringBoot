
package com.JMPK.practicasConPostMapping.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postController {
    
    
   @PostMapping("/cliente")
   public void crearCliente(@RequestBody Cliente cli){
       
       System.out.println("Cliente Creado");
       System.out.println("el nombre del cliente es: "+ cli.getNombre());
       System.out.println("el apellido es: "+ cli.getApellido());
   }
    
}
