
package com.JMAO.CANDEPISCO;

import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Turnos {
    private int idTurno;
    private String nomTurno;
    private LocalTime hora;

   public Turnos() {
    }

   public Turnos(int idTurno, String nomTurno, LocalTime hora) {
        this.idTurno = idTurno;
        this.nomTurno = nomTurno;
        this.hora = hora;
    }
    
    
    
 }
