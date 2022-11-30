package com.arcelino.clienteservice.application.core.usecase;

import com.arcelino.clienteservice.application.core.domain.Cliente;
import com.arcelino.clienteservice.application.ports.in.FindClienteByIdInputPort;
import com.arcelino.clienteservice.application.ports.in.UpdateClienteInputPort;
import com.arcelino.clienteservice.application.ports.out.FindEnderecoByCepOutputPort;
import com.arcelino.clienteservice.application.ports.out.UpdateClienteOutputPort;

public class UpdateClienteUseCase implements UpdateClienteInputPort {

    private final FindClienteByIdInputPort findClienteByIdInputPort;

    private final FindEnderecoByCepOutputPort findEnderecoByCepOutputPort;

    private final UpdateClienteOutputPort updateClienteOutputPort;

    public UpdateClienteUseCase(
            FindClienteByIdInputPort findClienteByIdInputPort,
            FindEnderecoByCepOutputPort findEnderecoByCepOutputPort,
            UpdateClienteOutputPort updateClienteOutputPort) {
        this.findClienteByIdInputPort = findClienteByIdInputPort;
        this.findEnderecoByCepOutputPort = findEnderecoByCepOutputPort;
        this.updateClienteOutputPort = updateClienteOutputPort;
    }

    @Override
    public void update(Cliente cliente, String cep) {
        findClienteByIdInputPort.findById(cliente.getId());
        var endereco = findEnderecoByCepOutputPort.findByCep(cep);
        cliente.setEndereco(endereco);
        updateClienteOutputPort.update(cliente);
    }
}
