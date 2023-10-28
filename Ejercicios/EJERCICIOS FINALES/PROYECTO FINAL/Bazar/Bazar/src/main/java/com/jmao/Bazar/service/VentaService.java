
package com.jmao.Bazar.service;

import com.jmao.Bazar.model.Venta;
import com.jmao.Bazar.repository.IVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{

   @Autowired
    IVentaRepository ventaRepo;
    
   @Override
    public List<Venta> getVentas() {
        return ventaRepo.findAll();
    }

    @Override
    public Venta getVenta(Long id) {
        Venta ven = ventaRepo.findById(id).orElse(null);
        return ven;
    }

    @Override
    public void saveVenta(Venta ven) {
        ventaRepo.save(ven);
    }

    @Override
    public void deleteVenta(Long id) {
        ventaRepo.deleteById(id);
    }

    @Override
    public void editVenta(Venta ven) {
       this.saveVenta(ven);
    }
    
}
