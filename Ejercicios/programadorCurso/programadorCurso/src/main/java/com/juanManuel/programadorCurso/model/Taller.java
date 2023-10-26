
package com.juanManuel.programadorCurso.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Taller {
    
   private Long curso;
   private String nombre;
   private String modalidad;
   private LocalDate fecha_finalizacion;
   
   private List<Contenido> listaTemas;

   public Taller() {
    }

   public Taller(Long curso, String nombre, String modalidad, LocalDate fecha_finalizacion, List<Contenido> listaTemas) {
        this.curso = curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;        this.listaTemas = listaTemas;
    }
   
    
 }
