
package com.JMAO.CANDEPISCO.Controller;

import com.JMAO.CANDEPISCO.Paciente;
import com.JMAO.CANDEPISCO.Turnos;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
   private List<Turnos> listaTurnos;
   private List<Paciente> listaPacientes;

   public Controller() {
       this.listaTurnos = new ArrayList();
       listaTurnos.add(new Turnos(1,"niños",LocalTime.of(10, 00)));
       listaTurnos.add(new Turnos(2,"niños",LocalTime.of(11, 00)));
       listaTurnos.add(new Turnos(3,"niños",LocalTime.of(12, 00)));
       listaTurnos.add(new Turnos(4,"Adolecentes",LocalTime.of(16, 00)));
       listaTurnos.add(new Turnos(5,"Adolecentes",LocalTime.of(17, 00)));
       listaTurnos.add(new Turnos(6,"Adolecentes",LocalTime.of(18, 00)));
       
       this.listaPacientes = new ArrayList();
       listaPacientes.add(new Paciente(1, "Bettina", "Olmos Arevalo", 5));
       listaPacientes.add(new Paciente(2, "Sofia", "Olmos novotny", 12));
       listaPacientes.add(new Paciente(3, "Santiago", "Olmos novotny", 10));
       listaPacientes.add(new Paciente(4, "Tefa", "Olmos", 27));
       listaPacientes.add(new Paciente(5, "Tiziana", "Olmos", 13));
       listaPacientes.add(new Paciente(6, "Bautista", "Olmos", 10));
       

    }
   
   
    
   @GetMapping("/turnos")
   public List<Turnos> traerTurnos(){
       return listaTurnos;
   }
   ResponseEntity<String> respuestaTurnos(){
       return new ResponseEntity<>("los turnos son: "+listaTurnos.toString(),HttpStatus.OK);
   }
   
   @GetMapping("/pacientes")
   public List<Paciente> traerPacientes(){
       return listaPacientes;
   }
   
   @GetMapping("/turnos/Niños")
    @ResponseBody
   public List<Object> turnosPeques(){
       List<Turnos> listaTurnos = traerTurnos();
       List<Turnos> listaPeques = new ArrayList();
       for(Turnos t:listaTurnos){
           if(t.getNomTurno().equals("niños")){
               listaPeques.add(t);
           }
       }
       List<Paciente> listaPacientes = traerPacientes();
       List<Paciente> pequePacientes = new ArrayList();
       for(Paciente p:listaPacientes){
           if(p.getEdad()<11){
               pequePacientes.add(p);
           }
       }
       
       List<Object> resultado = new ArrayList();
       resultado.addAll(listaPeques);
       resultado.addAll(pequePacientes);
       
       return resultado;
       
       
    }
      ResponseEntity<String> traerRespuesta(){
       return new ResponseEntity<>("los turnos disponibles son: "+ turnosPeques().toString(), HttpStatus.OK);
   }
    
 }
