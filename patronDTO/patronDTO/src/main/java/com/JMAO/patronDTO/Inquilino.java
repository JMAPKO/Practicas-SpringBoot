
package com.JMAO.patronDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Inquilino {
    
   private String DNI;
   private String nombre;
   private String apellido;
   private String Profesion;

   public Inquilino() {
    }

   public Inquilino(String DNI, String nombre, String apellido, String Profesion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Profesion = Profesion;
    }
    
   
   
    
 }
