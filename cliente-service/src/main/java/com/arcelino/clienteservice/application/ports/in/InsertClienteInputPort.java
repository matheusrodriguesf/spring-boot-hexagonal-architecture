package com.arcelino.clienteservice.application.ports.in;

import com.arcelino.clienteservice.application.core.domain.Cliente;

public interface InsertClienteInputPort {

    void create(Cliente cliente, String cep);

}
