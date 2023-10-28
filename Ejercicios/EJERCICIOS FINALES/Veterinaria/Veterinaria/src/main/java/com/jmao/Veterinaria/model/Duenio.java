
package com.jmao.Veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String celular;
    @OneToOne
    Mascota masco;

   public Duenio() {
    }

    public Duenio(Long id, String nombre, String apellido, String dni, String celular, Mascota masco) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.masco = masco;
    }

    
    

    
    
    
    
 }
