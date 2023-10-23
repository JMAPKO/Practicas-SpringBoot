
package com.JMAO.restaurante.Controller;

import com.JMAO.restaurante.Platos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
   private List<Platos> listaPlatos;

   public Controller() {
       listaPlatos = new ArrayList();
       listaPlatos.add(new Platos(1,"Milanesas napolitanas",10.50,"riquisimas con papas fritas"));
       listaPlatos.add(new Platos(2,"Pollo al verdeo",15.50,"con papitas noisette"));
       listaPlatos.add(new Platos(3,"Ravioles con crema",8.30,"caseros"));
       listaPlatos.add(new Platos(4,"Entreñana",32.20,"espectacular con papas fritas /o ensalada"));
       listaPlatos.add(new Platos(5,"Hamburguesa",12.50,"con papas fritas"));
       
       
    }
   
   
   
   @GetMapping("/Platos")
       public List<Platos> traerPlatos(){
       return listaPlatos;
       
    }
   
   @GetMapping("/Platos/{id}")
   public ResponseEntity<String> elegirPlato(@PathVariable int id){
       for (Platos p :listaPlatos){
           if(p.getId()==id){
               return new ResponseEntity <>("tu plato es el "+p.getNombre()+" "+p.getDescripcion()+"  y sale: "+p.getPrecio(), HttpStatus.OK);
           }
         
         }
       
       return new ResponseEntity<>("tu plato no existe",HttpStatus.NOT_FOUND);
    }
   
    
 }
