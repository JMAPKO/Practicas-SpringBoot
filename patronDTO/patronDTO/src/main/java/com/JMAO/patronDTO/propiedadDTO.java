
package com.JMAO.patronDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class propiedadDTO {
    
   private int id;
   private String tipo_propiedad;
   private String direccion;
   private String nombre;
   private String apellido;
   private double precio;

   public propiedadDTO() {
    }

   public propiedadDTO(int id, String tipo_propiedad, String direccion, String nombre, String apellido, double precio) {
        this.id = id;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.precio = precio;
    }
   
   
    
 }
