
package com.JMAO.odontologo.Controller;

import com.JMAO.odontologo.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping ("/pacientes")
  public List<Paciente>traerPacientes() {
      List<Paciente> listaPacientes = new ArrayList();
   
    
    listaPacientes.add(new Paciente(1,39360125,"Juan Martin","Di Stefano", LocalDate.of(1995, 10, 10)));
    listaPacientes.add(new Paciente(2,39360123," Maria","Sonprano", LocalDate.of(2016, 10, 3)));
    listaPacientes.add(new Paciente(3,39367644,"Lucia","Marx", LocalDate.of(1996, 8, 7)));
    listaPacientes.add(new Paciente(4,31243545,"Roberto","Olmos", LocalDate.of(1990, 10, 5)));
    listaPacientes.add(new Paciente(5,376425134,"Agustin","Justefker", LocalDate.of(2015, 8, 8)));
   
      
      return listaPacientes;
    }
  
  @GetMapping("/pacientes/menores")
  public List<Paciente> listaMenores(){
     List<Paciente> listaPacientes = traerPacientes();
     List<Paciente> menoresEdad = new ArrayList();
          
     for(Paciente p:listaPacientes){
         int edad = Period.between(p.getFechaN(), LocalDate.now()).getYears();
         
         if (edad < 18){
             menoresEdad.add(p);
         }
     }
     
     return menoresEdad;
  }
   
   
   
   
    
 }
