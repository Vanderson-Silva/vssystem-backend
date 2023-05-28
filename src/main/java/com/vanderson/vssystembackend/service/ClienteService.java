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
    public Cliente findById(Long id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElse(null);
    }


    // metodo para listar todos os clientes.
    public List<Cliente> listarTodosClientes() {
        List<Cliente> list = clienteRepository.findAll();
        return list;
    }

    // metodo para deletar um cliente.
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    // metodo para Salvar um cliente.
    public Cliente create(Cliente obj) {
        obj.setId(null);
        return clienteRepository.save(obj);

    }

    // metodo para editar um cliente
    public Cliente update(Long id, Cliente obj) {
        Cliente cliente = findById(id);
        cliente.setNome(obj.getNome());
        cliente.setCpf(obj.getCpf());
        cliente.setStatus(obj.getStatus());
        cliente.setEndereco(obj.getEndereco());
        cliente.setNumero(obj.getNumero());
        cliente.setBairro(obj.getBairro());
        cliente.setCidade(obj.getCidade());
        cliente.setTelefone(obj.getTelefone());
        cliente.setCelular(obj.getCelular());
        return clienteRepository.save(cliente);
    }
}
