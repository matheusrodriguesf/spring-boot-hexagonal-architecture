package com.arcelino.clienteservice.application.core.usecase;

import com.arcelino.clienteservice.application.ports.in.DeleteClienteInputPort;
import com.arcelino.clienteservice.application.ports.in.FindClienteByIdInputPort;
import com.arcelino.clienteservice.application.ports.out.DeleteClienteByIdOutputPort;

public class DeleteClienteUseCase implements DeleteClienteInputPort {

    private final FindClienteByIdInputPort findClienteByIdInputPort;

    private final DeleteClienteByIdOutputPort deleteClienteByIdOutputPort;

    public DeleteClienteUseCase(
            FindClienteByIdInputPort findClienteByIdInputPort,
            DeleteClienteByIdOutputPort deleteClienteByIdOutputPort) {
        this.findClienteByIdInputPort = findClienteByIdInputPort;
        this.deleteClienteByIdOutputPort = deleteClienteByIdOutputPort;
    }

    @Override
    public void delete(Integer id) {
        findClienteByIdInputPort.findById(id);
        deleteClienteByIdOutputPort.delete(id);
    }
}
