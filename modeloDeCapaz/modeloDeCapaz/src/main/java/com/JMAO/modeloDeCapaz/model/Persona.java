
package com.JMAO.modeloDeCapaz.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    
   private int id;
   private String Nombre;
   private String apellido;
   private int edad;

   public Persona() {
    }

   public Persona(int id, String Nombre, String apellido, int edad) {
        this.id = id;
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   
   
    
 }
