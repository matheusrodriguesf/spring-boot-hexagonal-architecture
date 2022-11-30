package com.arcelino.clienteservice.adapters.out.client;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcelino.clienteservice.adapters.out.client.viacep.FindEnderecoByCepClient;
import com.arcelino.clienteservice.application.core.domain.Endereco;
import com.arcelino.clienteservice.application.ports.out.FindEnderecoByCepOutputPort;

@Component
public class FindEnderecoByCepAdapter implements FindEnderecoByCepOutputPort {

    @Autowired
    private FindEnderecoByCepClient findEnderecoByCepClient;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Endereco findByCep(String cep) {
        return modelMapper.map(findEnderecoByCepClient.findEnderecoByCep(cep), Endereco.class);

    }

}
