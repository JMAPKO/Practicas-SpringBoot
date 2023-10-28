
package com.jmao.Bazar.controller;

import com.jmao.Bazar.model.Producto;
import com.jmao.Bazar.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @Autowired
   IProductoService productoSrv;
    
   @GetMapping("/productos")
    public List<Producto> MostrarProductos(){
        return productoSrv.traerProductos();
    }
   
   @PostMapping("/productos/crear")
   public String crearNuevoProductos(@RequestBody Producto pro){
       productoSrv.crearProducto(pro);
       return "se creo un nuevo producto con exito: "+pro.getNombre();
   }
    
   @DeleteMapping("/productos/{codigo_producto}/borrar")
   public String EliminarProducto(@PathVariable Long codigo_producto){
       productoSrv.borrarProducto(codigo_producto);
       return "el producto con id:"+codigo_producto+", fue eliminado correctamente";
   }
    
   @GetMapping("/productos/{codigo_producto}")
   public Producto seleccionarProducto(@PathVariable Long codigo_producto){
       Producto pro = productoSrv.traerProducto(codigo_producto);
       return pro;
   }
    
   @PutMapping("/productos/{codigo_producto}/editar")
   public String actualizarProducto(@RequestBody Producto pro,
                                    @PathVariable Long codigo_producto){
       productoSrv.editarProducto(pro);
       return "el producto: "+pro.getNombre()+", se actualizo correctamente ";
   }
   
 }
