package com.arcelino.clienteservice.adapters.out.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arcelino.clienteservice.adapters.mapper.EnderecoMapper;
import com.arcelino.clienteservice.adapters.out.client.viacep.FindEnderecoByCepClient;
import com.arcelino.clienteservice.application.core.domain.Endereco;
import com.arcelino.clienteservice.application.ports.out.FindEnderecoByCepOutputPort;

@Component
public class FindEnderecoByCepAdapter implements FindEnderecoByCepOutputPort {

    @Autowired
    private FindEnderecoByCepClient findEnderecoByCepClient;

    @Autowired
    private EnderecoMapper enderecoMapper;

    @Override
    public Endereco findByCep(String cep) {
        return enderecoMapper.toEndereco(findEnderecoByCepClient.findEnderecoByCep(cep));
    }
}
