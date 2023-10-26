
package com.jmao.programador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contenido {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
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
