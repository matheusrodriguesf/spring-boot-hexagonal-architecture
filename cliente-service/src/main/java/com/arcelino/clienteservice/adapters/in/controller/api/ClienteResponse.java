package com.arcelino.clienteservice.adapters.in.controller.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {

    private String nome;
    private String email;
    private EnderecoResponse endereco;

}
