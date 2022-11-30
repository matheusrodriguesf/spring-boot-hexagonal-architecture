package com.arcelino.clienteservice.application.ports.out;

import com.arcelino.clienteservice.application.core.domain.Cliente;

public interface InsertClienteOutputPort {
    void insert(Cliente cliente);
}
