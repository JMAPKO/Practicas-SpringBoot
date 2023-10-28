package com.todocodeacademy.clinica_veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    
    @OneToOne
    @JoinColumn (name="id_duenio", referencedColumnName = "id_duenio")
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String especie, String raza, String color) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
    
    

}
