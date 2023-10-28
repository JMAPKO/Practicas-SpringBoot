package com.jmao.Bazar.controller;

import com.jmao.Bazar.model.Venta;
import com.jmao.Bazar.service.IVentaService;
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
public class VentaController {
    
   @Autowired
   IVentaService ventaSrv;
   
   @GetMapping("/ventas")
   public List<Venta> traerVentas(){
       return ventaSrv.getVentas();
   }
   
   @GetMapping("/ventas/{codigo_venta}")
   public Venta traerVenta(@PathVariable Long codigo_venta){
       Venta ven = ventaSrv.getVenta(codigo_venta);
       return ven;
   }
   
   @PostMapping("/ventas/crear")
   public String crearVenta(Venta ven){
       ventaSrv.saveVenta(ven);
       return "la venta se realizo con exito";
   }
   
   @DeleteMapping("/ventas/{codigo_venta}/borrar")
   public String borrarVenta(@PathVariable Long codigo_venta){
       ventaSrv.deleteVenta(codigo_venta);
       return "La venta n°: "+codigo_venta+", fue eliminada ";
   }
   
   @PutMapping("/ventas/{codigo_venta}/editar")
   public String editarVenta(@RequestBody Venta ven,
                             @PathVariable Long codigo_venta){
       this.ventaSrv.editVenta(ven);
       return "la venta n° "+ven.getCodigo_venta()+" fue modificada exitosamente";
   }
    
}
