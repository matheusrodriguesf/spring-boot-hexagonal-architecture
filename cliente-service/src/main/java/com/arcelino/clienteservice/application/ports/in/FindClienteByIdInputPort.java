package com.arcelino.clienteservice.application.ports.in;

import com.arcelino.clienteservice.application.core.domain.Cliente;

public interface FindClienteByIdInputPort {

    Cliente findById(Integer id);
}
