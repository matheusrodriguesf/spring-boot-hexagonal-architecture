package com.arcelino.clienteservice.adapters.out.client.viacep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.arcelino.clienteservice.adapters.out.client.viacep.api.EnderecoApi;

@FeignClient(name = "viacep", url = "${client.viacep.url}")
public interface FindEnderecoByCepClient {

    @GetMapping("/ws/{cep}/json")
    EnderecoApi findEnderecoByCep(@PathVariable("cep") String cep);
}
