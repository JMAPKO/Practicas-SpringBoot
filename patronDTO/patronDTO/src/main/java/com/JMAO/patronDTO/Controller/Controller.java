
package com.JMAO.patronDTO.Controller;

import com.JMAO.patronDTO.Inquilino;
import com.JMAO.patronDTO.Propiedad;
import com.JMAO.patronDTO.propiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
   @GetMapping("/propiedad/{id}")
   public propiedadDTO traerPropiedad(@PathVariable int id){
   
    Propiedad prop = new Propiedad(150,"casa 1D","alvarez condarco 17",47.12,150);
    Inquilino inq = new Inquilino("36925632", "Candela Maria", "Albarracin Olmos", "Psicologa");
    
    propiedadDTO propDTO = new propiedadDTO();
    
    //agregamos los datos de propiedad
    propDTO.setId(prop.getIdProp());
    propDTO.setTipo_propiedad(prop.getTipo_propiedad());
    propDTO.setDireccion(prop.getDireccion());
    propDTO.setPrecio(prop.getPrecio());
    //agregamos los datos del inquilino
    propDTO.setNombre(inq.getNombre());
    propDTO.setApellido(inq.getApellido());
   
    return propDTO;
    
   
   
   
    }
   
    
 }
