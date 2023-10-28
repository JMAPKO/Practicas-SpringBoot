
package com.jmao.Bazar.service;

import com.jmao.Bazar.model.Cliente;
import com.jmao.Bazar.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService implements IClienteService {
    
    @Autowired
    IClienteRepository cliRepo;

    @Override
    public List<Cliente> getClientes() {
        return cliRepo.findAll();
    }

    @Override
    public Cliente getCliente(Long id_cliente) {
        Cliente cli = cliRepo.findById(id_cliente).orElse(null);
        return cli;
    }

    @Override
    public void saveCliente(Cliente cli) {
        cliRepo.save(cli);
    }

    @Override
    public void deleteCliente(Long id_cliente) {
        cliRepo.deleteById(id_cliente);
    }

    @Override
    public void editarCliente(Cliente cli) {
        this.saveCliente(cli);
    }
    
}
