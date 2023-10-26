
package com.jmao.programador.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class cursosDTO {
    
   private Long id;
   private String nombre;
   private String modalidad;
   private LocalDate fecha_finalizacion;
   private String nombre_tema;
   private String descripcion;

   public cursosDTO() {
    }

   public cursosDTO(Long id, String nombre, String modalidad, LocalDate fecha_finalizacion, String nombre_tema, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.nombre_tema = nombre_tema;
        this.descripcion = descripcion;
    }
    
    
 }
