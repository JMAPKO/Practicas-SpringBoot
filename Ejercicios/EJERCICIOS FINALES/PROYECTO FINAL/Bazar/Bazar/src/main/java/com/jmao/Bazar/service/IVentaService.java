
package com.jmao.Bazar.service;

import com.jmao.Bazar.model.Venta;
import java.util.List;


public interface IVentaService {
    
   public List<Venta> getVentas();
   
   public Venta getVenta(Long id);
   
   public void saveVenta(Venta ven);
   
   public void deleteVenta (Long id);
   
   public void editVenta(Venta ven);
    
}
