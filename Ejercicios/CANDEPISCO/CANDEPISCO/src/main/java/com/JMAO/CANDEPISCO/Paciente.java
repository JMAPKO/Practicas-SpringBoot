
package com.JMAO.CANDEPISCO;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Paciente {
    
   private int idPaciente;
   private String nombre;
   private String apellido;
   private int edad;

   public Paciente() {
    }

   public Paciente(int idPaciente, String nombre, String apellido, int edad) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    
 }
