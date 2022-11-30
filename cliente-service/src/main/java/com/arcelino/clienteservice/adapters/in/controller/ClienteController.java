package com.arcelino.clienteservice.adapters.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcelino.clienteservice.adapters.in.controller.api.ClienteForm;
import com.arcelino.clienteservice.adapters.mapper.ClienteMapper;
import com.arcelino.clienteservice.application.ports.in.InsertClienteInputPort;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private InsertClienteInputPort insertClienteInputPort;

    @Autowired
    private ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody ClienteForm clienteForm) {
        var cliente = clienteMapper.toCliente(clienteForm);
        insertClienteInputPort.create(cliente, clienteForm.getCep());
        return ResponseEntity.ok().build();
    }
}
