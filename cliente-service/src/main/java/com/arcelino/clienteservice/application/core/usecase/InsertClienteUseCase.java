package com.arcelino.clienteservice.application.core.usecase;

import com.arcelino.clienteservice.application.core.domain.Cliente;
import com.arcelino.clienteservice.application.ports.out.FindEnderecoByCepOutputPort;
import com.arcelino.clienteservice.application.ports.out.InsertClienteOutputPort;

public class InsertClienteUseCase {

    private final FindEnderecoByCepOutputPort findEnderecoByCepOutputPort;
    private final InsertClienteOutputPort insertClienteOutputPort;

    public InsertClienteUseCase(FindEnderecoByCepOutputPort findEnderecoByCepOutputPort,
            InsertClienteOutputPort insertClienteOutputPort) {
        this.findEnderecoByCepOutputPort = findEnderecoByCepOutputPort;
        this.insertClienteOutputPort = insertClienteOutputPort;
    }

    public void create(Cliente cliente, String cep) {
        var endereco = findEnderecoByCepOutputPort.findByCep(cep);
        cliente.setEndereco(endereco);
        insertClienteOutputPort.insert(cliente);
    }
}
