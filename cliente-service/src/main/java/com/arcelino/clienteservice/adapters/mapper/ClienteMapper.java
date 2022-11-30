package com.arcelino.clienteservice.adapters.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.arcelino.clienteservice.adapters.in.controller.api.ClienteForm;
import com.arcelino.clienteservice.adapters.in.controller.api.ClienteResponse;
import com.arcelino.clienteservice.adapters.out.persistence.entity.ClienteEntity;
import com.arcelino.clienteservice.application.core.domain.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity toClienteEntity(Cliente cliente);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    Cliente toCliente(ClienteForm clienteForm);

    Cliente toCliente(ClienteEntity clienteEntity);
    
    ClienteResponse toClienteResponse(Cliente cliente);

}
