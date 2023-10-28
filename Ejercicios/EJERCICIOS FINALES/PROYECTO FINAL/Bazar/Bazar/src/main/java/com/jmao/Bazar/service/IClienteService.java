
package com.jmao.Bazar.service;

import com.jmao.Bazar.model.Cliente;
import java.util.List;

public interface IClienteService {
    
//   Mostrar datos:
    public List<Cliente> getClientes();

//Mostrar un solo cliente
    public Cliente getCliente(Long id_cliente);
    
//crear un cliente
    public void saveCliente(Cliente cli);
//    borrar un cliente
    public void deleteCliente(Long id_cliente);
//    editar cliente
    public void editarCliente(Cliente cli);
    
    
}
