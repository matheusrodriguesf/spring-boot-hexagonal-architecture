package com.arcelino.clienteservice.adapters.mapper;

import org.mapstruct.Mapper;

import com.arcelino.clienteservice.adapters.out.client.viacep.api.EnderecoApi;
import com.arcelino.clienteservice.application.core.domain.Endereco;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {

    EnderecoApi toEnderecoApi(Endereco endereco);
    Endereco toEndereco(EnderecoApi enderecoApi);
}
