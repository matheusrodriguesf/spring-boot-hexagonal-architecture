package com.arcelino.clienteservice.adapters.out.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arcelino.clienteservice.adapters.out.persistence.entity.ClienteEntity;

public interface ClienteRepository extends MongoRepository<ClienteEntity, Integer> {
}
