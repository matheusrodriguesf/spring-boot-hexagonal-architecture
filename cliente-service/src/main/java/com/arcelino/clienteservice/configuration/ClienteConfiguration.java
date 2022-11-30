package com.arcelino.clienteservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arcelino.clienteservice.adapters.out.DeleteClienteAdapter;
import com.arcelino.clienteservice.adapters.out.FindClienteByIdAdapter;
import com.arcelino.clienteservice.adapters.out.InsertClienteAdapter;
import com.arcelino.clienteservice.adapters.out.UpdateClienteAdapter;
import com.arcelino.clienteservice.adapters.out.client.FindEnderecoByCepAdapter;
import com.arcelino.clienteservice.application.core.usecase.DeleteClienteUseCase;
import com.arcelino.clienteservice.application.core.usecase.FindClienteUseCase;
import com.arcelino.clienteservice.application.core.usecase.InsertClienteUseCase;
import com.arcelino.clienteservice.application.core.usecase.UpdateClienteUseCase;

@Configuration
public class ClienteConfiguration {

    @Bean
    public InsertClienteUseCase insertClienteUseCase(
            FindEnderecoByCepAdapter findEnderecoByCepAdapter,
            InsertClienteAdapter insertClienteAdapter) {
        return new InsertClienteUseCase(findEnderecoByCepAdapter, insertClienteAdapter);
    }

    @Bean
    public FindClienteUseCase findClienteUseCase(FindClienteByIdAdapter findClienteByIdAdapter) {
        return new FindClienteUseCase(findClienteByIdAdapter);
    }

    @Bean
    public UpdateClienteUseCase updateClienteUseCase(
            FindClienteUseCase findClienteUseCase,
            FindEnderecoByCepAdapter findEnderecoByCepAdapter,
            UpdateClienteAdapter updateClienteAdapter) {
        return new UpdateClienteUseCase(findClienteUseCase, findEnderecoByCepAdapter, updateClienteAdapter);
    }

    @Bean
    public DeleteClienteUseCase deleteClienteUseCase(
            FindClienteUseCase findClienteUseCase,
            DeleteClienteAdapter deleteClienteAdapter) {
        return new DeleteClienteUseCase(findClienteUseCase, deleteClienteAdapter);
    }
}
