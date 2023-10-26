
package com.jmao.programador.service;

import com.jmao.programador.model.Taller;
import java.util.List;

public interface ITallerService {
    
   public void saveTaller(Taller tall);
   
   public List<Taller> getTalleres();
   
   public void dropTaller(Long id);
   
   public Taller findTaller(Long id);
   
   //metodo para editar Talleres
      public void editTalleres (Taller tall);
      
   //mostrar solo cursos Java:
      public List<Taller> getTalleresJava();
      public List<Taller> getTalleresSQL();
      
 }
