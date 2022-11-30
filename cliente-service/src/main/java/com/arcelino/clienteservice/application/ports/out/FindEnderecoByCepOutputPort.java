package com.arcelino.clienteservice.application.ports.out;

import com.arcelino.clienteservice.application.core.domain.Endereco;

public interface FindEnderecoByCepOutputPort {
    Endereco findByCep(String cep);
}
