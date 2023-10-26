
package com.JMAO.practicaUnoJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;
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
   
   @ManyToMany
    private List<Persona> listaPersona;

   public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String Color, List<Persona> listaPersona) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.Color = Color;
        this.listaPersona = listaPersona;
    }


    
   
    
 }
