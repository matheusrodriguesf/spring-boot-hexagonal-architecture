package com.arcelino.clienteservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcelino.clienteservice.adapters.mapper.ClienteMapper;
import com.arcelino.clienteservice.adapters.out.persistence.repository.ClienteRepository;
import com.arcelino.clienteservice.application.core.domain.Cliente;
import com.arcelino.clienteservice.application.ports.out.UpdateClienteOutputPort;

@Component
public class UpdateClienteAdapter implements UpdateClienteOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteEntityMapper;

    @Override
    public void update(Cliente cliente) {
        clienteRepository.save(clienteEntityMapper.toClienteEntity(cliente));
    }
}
