package com.arcelino.clienteservice.application.ports.out;

import java.util.Optional;

import com.arcelino.clienteservice.application.core.domain.Cliente;

public interface FindClienteByIdOutputPort {

    Optional<Cliente> findById(Integer id);

}
