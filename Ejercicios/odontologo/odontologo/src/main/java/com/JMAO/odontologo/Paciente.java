
package com.JMAO.odontologo;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class Paciente {
    
   private int id;
   private int DNI;
   private String nombre;
   private String apellido;
   private LocalDate fechaN; 

   public Paciente() {
    }

   public Paciente(int id, int DNI, String nombre, String apellido, LocalDate fechaN) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
    }
   
   
   
   
  }
