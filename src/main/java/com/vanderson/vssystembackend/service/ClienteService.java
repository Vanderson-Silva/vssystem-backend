package com.vanderson.vssystembackend.service;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    // Metodo de busca pelo Id
    public Cliente buscarPorIdCliente(Long id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElse(null);
    }

    // metodo para listar todos os clientes.
    public List<Cliente> listarTodosClientes() {
        List<Cliente> list = clienteRepository.findAll();
        return list;
    }

    // metodo para deletar um cliente.
    public void delete(Long id){
        clienteRepository.deleteById(id);
    }


}
