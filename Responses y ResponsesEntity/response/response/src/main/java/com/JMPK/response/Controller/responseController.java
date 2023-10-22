
package com.JMPK.response.Controller;

import com.JMPK.response.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class responseController {
    
   @GetMapping ("/cliente/traer")
   @ResponseBody
   public List<Cliente> traerClientes(){
       List<Cliente> listaClientes = new ArrayList();
       listaClientes.add(new Cliente(1L,"Lionel Andres","Messi"));
       listaClientes.add(new Cliente(2L,"Julian","Alvarez"));
       listaClientes.add(new Cliente(3L,"Angel","Di Maria"));
    
       return listaClientes;
   
    }
       
   
   @GetMapping("/respuesta")
   ResponseEntity<String> traerRespuesta(){
       return new ResponseEntity<> ("Esta es una prueba de respuesta", HttpStatus.NOT_FOUND);
   }
   
   
 }
