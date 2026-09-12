package com.lyalencar.icompras.clientes.service;

import com.lyalencar.icompras.clientes.model.Cliente;
import com.lyalencar.icompras.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente criarCliente(Cliente clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    @Transactional(readOnly = true)
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).
                orElseThrow( () -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }


}
