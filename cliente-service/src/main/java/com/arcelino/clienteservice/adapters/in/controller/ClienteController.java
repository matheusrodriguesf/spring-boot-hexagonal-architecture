package com.arcelino.clienteservice.adapters.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcelino.clienteservice.adapters.in.controller.api.ClienteForm;
import com.arcelino.clienteservice.adapters.in.controller.api.ClienteResponse;
import com.arcelino.clienteservice.adapters.mapper.ClienteMapper;
import com.arcelino.clienteservice.application.ports.in.FindClienteByIdInputPort;
import com.arcelino.clienteservice.application.ports.in.InsertClienteInputPort;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private InsertClienteInputPort insertClienteInputPort;

    @Autowired
    private FindClienteByIdInputPort findClienteByIdInputPort;

    @Autowired
    private ClienteMapper clienteMapper;

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> findById(@PathVariable Integer id) {
        var cliente = findClienteByIdInputPort.findById(id);
        return ResponseEntity.ok().body(clienteMapper.toClienteResponse(cliente));
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody ClienteForm clienteForm) {
        var cliente = clienteMapper.toCliente(clienteForm);
        insertClienteInputPort.create(cliente, clienteForm.getCep());
        return ResponseEntity.ok().build();
    }
}
