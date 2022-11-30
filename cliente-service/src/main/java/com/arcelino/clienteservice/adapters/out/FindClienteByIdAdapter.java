package com.arcelino.clienteservice.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcelino.clienteservice.adapters.mapper.ClienteMapper;
import com.arcelino.clienteservice.adapters.out.persistence.repository.ClienteRepository;
import com.arcelino.clienteservice.application.core.domain.Cliente;
import com.arcelino.clienteservice.application.ports.out.FindClienteByIdOutputPort;

@Component
public class FindClienteByIdAdapter implements FindClienteByIdOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id).map(clienteMapper::toCliente);
    }
}
