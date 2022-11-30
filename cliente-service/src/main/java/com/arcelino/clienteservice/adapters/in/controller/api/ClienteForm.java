package com.arcelino.clienteservice.adapters.in.controller.api;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteForm {

    @NotBlank
    private String nome;
    
    @NotBlank
    private String email;
    
    @NotBlank
    private String cep;

}
