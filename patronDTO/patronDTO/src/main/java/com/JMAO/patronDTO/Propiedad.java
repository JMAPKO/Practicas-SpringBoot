
package com.JMAO.patronDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Propiedad {
    
   private int idProp;
   private String tipo_propiedad;
   private String direccion;
   private double metros_cuadrados;
   private double precio;

   public Propiedad() {
    }

   public Propiedad(int idProp, String tipo_propiedad, String direccion, double metros_cuadrados, double precio) {
        this.idProp = idProp;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.precio = precio;
    }
   
   
    
    
 }
