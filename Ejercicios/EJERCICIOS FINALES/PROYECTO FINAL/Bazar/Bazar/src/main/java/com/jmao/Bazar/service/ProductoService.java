
package com.jmao.Bazar.service;

import com.jmao.Bazar.model.Producto;
import com.jmao.Bazar.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {
    
   @Autowired
   IProductoRepository producRepo;

   @Override
    public List<Producto> traerProductos() {
       return producRepo.findAll();
        }

   @Override
    public void crearProducto(Producto pro) {
        producRepo.save(pro);
    }

   @Override
    public void borrarProducto(Long id) {
        producRepo.deleteById(id);
    }

   @Override
    public Producto traerProducto(Long id) {
        Producto pro = producRepo.findById(id).orElse(null);
        return pro;
    }

   @Override
    public void editarProducto(Producto pro) {
        this.crearProducto(pro);
    }
    
}
