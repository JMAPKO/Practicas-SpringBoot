
package com.jmao.Bazar.controller;

import com.jmao.Bazar.model.Cliente;
import com.jmao.Bazar.service.IClienteService;
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
public class ClienteController {
    @Autowired
    IClienteService clienteSrv;
    
//    mostrar clientes:
    @GetMapping ("/clientes")
    public List<Cliente> mostrarClientes(){
        return clienteSrv.getClientes();
    }
    
//    mostrar un solo cliente:
    @GetMapping("/clientes/{id_cliente}")
    public Cliente traerCliente(@PathVariable Long id_cliente){
        Cliente cli = clienteSrv.getCliente(id_cliente);
        return cli;
    }
    
//    crear un cliente:
    @PostMapping("/clientes/crear")
    public String crearCliente (Cliente cli){
        clienteSrv.saveCliente(cli);
        return "se guardo exitosamente al cliente: "+cli.getNombre();
    }
    
    @DeleteMapping("/clientes/{id_cliente}/borrar")
    public String borrarCliente (@PathVariable Long id_cliente){
        clienteSrv.deleteCliente(id_cliente);
        return "el cliente con id numero :"+id_cliente+" fue eliminado exitosamente";
    }
    
    @PutMapping("/clientes/{id_cliente}/editar")
    public String editarCliente (@RequestBody Cliente cli,
                                 @PathVariable Long id_cliente){
        this.clienteSrv.editarCliente(cli);
        return "el cliente: "+cli.getNombre()+"| "+cli.getApellido()+" - modificado exitosamente";
    }
    
    
 }
