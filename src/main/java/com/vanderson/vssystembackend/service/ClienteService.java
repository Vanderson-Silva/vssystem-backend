package com.vanderson.vssystembackend.service;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    // Metodo de busca pelo Id
    public Cliente buscaPorIdCliente(Long id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElse(null);
    }

}
