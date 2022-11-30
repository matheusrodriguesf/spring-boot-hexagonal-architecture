package com.arcelino.clienteservice.application.core.usecase;

import com.arcelino.clienteservice.application.core.domain.Cliente;
import com.arcelino.clienteservice.application.ports.in.FindClienteByIdInputPort;
import com.arcelino.clienteservice.application.ports.out.FindClienteByIdOutputPort;

public class FindClienteUseCase implements FindClienteByIdInputPort {

    private FindClienteByIdOutputPort findClienteByIdOutputPort;

    public FindClienteUseCase(FindClienteByIdOutputPort findClienteByIdOutputPort) {
        this.findClienteByIdOutputPort = findClienteByIdOutputPort;
    }

    @Override
    public Cliente findById(Integer id) {
        return findClienteByIdOutputPort.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
