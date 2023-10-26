
package com.juanManuel.programadorCurso.model;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class Contenido {
    
   private int id_tema;
   private String nombre;
   private String descripcion;

   public Contenido() {
    }

    public Contenido(int id_tema, String nombre, String descripcion) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
   
    
    
 }
