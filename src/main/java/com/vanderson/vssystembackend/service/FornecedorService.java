package com.vanderson.vssystembackend.service;


import com.vanderson.vssystembackend.model.Fornecedor;
import com.vanderson.vssystembackend.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    // Metodo de busca pelo Id
    public Fornecedor findById(Long id) {
        Optional<Fornecedor> obj = fornecedorRepository.findById(id);
        return obj.orElse(null);
    }


    // metodo para listar todos os fornecedores.
    public List<Fornecedor> listarTodosFornecedores() {
        List<Fornecedor> list = fornecedorRepository.findAll();
        return list;
    }

    // metodo para excluir um fornecedor
    public void delete(Long id) {
        fornecedorRepository.deleteById(id);
    }

    //metodo para salvar um fornecedor
    public Fornecedor create(Fornecedor obj) {
        obj.setId(null);
        return fornecedorRepository.save(obj);
    }

    // metodo para editar um cliente
    public Fornecedor update(Long id, Fornecedor obj) {
        Fornecedor fornecedor = findById(id);
        fornecedor.setNome(obj.getNome());
        fornecedor.setCnpj(obj.getCnpj());
        fornecedor.setStatus(obj.getStatus());
        fornecedor.setEndereco(obj.getEndereco());
        fornecedor.setNumero(obj.getNumero());
        fornecedor.setBairro(obj.getBairro());
        fornecedor.setCidade(obj.getCidade());
        fornecedor.setTelefone(obj.getTelefone());
        fornecedor.setCelular(obj.getCelular());
        return fornecedorRepository.save(fornecedor);
    }

}
