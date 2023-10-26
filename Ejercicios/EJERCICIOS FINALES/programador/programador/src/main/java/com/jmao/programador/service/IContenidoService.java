
package com.jmao.programador.service;

import com.jmao.programador.model.Contenido;
import java.util.List;

public interface IContenidoService {
    
   public void saveContenido(Contenido cont);
   
   public List<Contenido> mostrarTemas();
   
   public void borrarContenido(int id);
   
   public Contenido traerTema(int id);
   
   public void editarTema (Contenido cont);
   
    
 }
