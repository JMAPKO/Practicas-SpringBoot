
package com.jmao.programador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Taller {
   
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Long id;
   private String nombre;
   private String modalidad;
   private LocalDate fecha_finalizacion;
   
   @OneToMany
   private List<Contenido> temas;
   

   public Taller() {
    }
   
    
    
 }
