
package com.JMAO.practicaUnoJpa.service;

import com.JMAO.practicaUnoJpa.model.Persona;
import java.util.List;

public interface IPersonaService {
    
   //metodo para Traer a las personas (LEER)
    public List<Persona> getPersonas();
    
    
   //Metodo para CREAR una persona
    public void savePersona(Persona perso);
    
   //Metodo para dar de BAJA
    public void deletePersona(Long id);
    
   //Metodo para traer UNA sola persona (leer 1 solo)
    public Persona findPersona(Long id);
    
   //Metodo para EDITAR
    public void editPersona(Long idOriginal, Long idNueva,
                             String nuevoNombre,
                             String nuevoApellido,
                             int nuevaEdad);
    
    
    
     
    
 }
