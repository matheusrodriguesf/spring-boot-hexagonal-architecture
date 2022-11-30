package com.arcelino.clienteservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcelino.clienteservice.adapters.out.persistence.repository.ClienteRepository;
import com.arcelino.clienteservice.application.ports.out.DeleteClienteByIdOutputPort;

@Component
public class DeleteClienteAdapter implements DeleteClienteByIdOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }
}
