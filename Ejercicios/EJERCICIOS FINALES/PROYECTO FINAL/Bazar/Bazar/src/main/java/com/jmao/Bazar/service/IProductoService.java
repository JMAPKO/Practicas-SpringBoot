
package com.jmao.Bazar.service;

import com.jmao.Bazar.model.Producto;
import java.util.List;

public interface IProductoService {
   
   //TRAER LEER TODOS
   public List<Producto> traerProductos();
   
   //CREAR
   public void crearProducto(Producto pro);
   
   //BORRAR
   public void borrarProducto(Long id);
   
   //TRAER UNO
   public Producto traerProducto(Long id);
   
   
   //MODIFICAR
   public void editarProducto(Producto pro);


   
 }
