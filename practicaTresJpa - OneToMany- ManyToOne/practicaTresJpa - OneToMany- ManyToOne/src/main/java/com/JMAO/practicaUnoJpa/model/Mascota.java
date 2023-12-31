
package com.JMAO.practicaUnoJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Mascota {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   private Long id_mascota;
   private String nombre;
   private String especie;
   private String raza;
   private String Color;

   public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String Color) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.Color = Color;
    }
    
   
    
 }
