package com.arcelino.clienteservice.adapters.out.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "cliente")
public class ClienteEntity {
    @Id
    private Integer id;
    private String nome;
    private String email;
    private EnderecoEntity endereco;
}
