
package com.JMAO.restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Platos {
    
   private int id;
   private String nombre;
   private double precio;
   private String descripcion;

   public Platos() {
    }

   public Platos(int id, String nombre, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
   
    
 }
