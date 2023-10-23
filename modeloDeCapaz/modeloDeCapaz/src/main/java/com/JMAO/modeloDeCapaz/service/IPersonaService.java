
package com.JMAO.modeloDeCapaz.service;

import com.JMAO.modeloDeCapaz.model.Persona;
import java.util.List;


public interface IPersonaService {
   //Crear Metodos
    
   //metodo para crear Personas
   public void crearPersona(Persona per);
   
   //metodo para crear listas de personas
   public List<Persona> traerPersonas();
    
}
