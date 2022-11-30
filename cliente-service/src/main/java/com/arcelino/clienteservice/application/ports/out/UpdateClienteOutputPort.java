package com.arcelino.clienteservice.application.ports.out;

import com.arcelino.clienteservice.application.core.domain.Cliente;

public interface UpdateClienteOutputPort {

    void update(Cliente cliente);

}
