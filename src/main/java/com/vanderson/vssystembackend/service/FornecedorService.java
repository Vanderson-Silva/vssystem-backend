package com.vanderson.vssystembackend.service;


import com.vanderson.vssystembackend.model.Fornecedor;
import com.vanderson.vssystembackend.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    // metodo para listar todos os fornecedores.
    public List<Fornecedor> listarTodosFornecedores() {
        List<Fornecedor> list = fornecedorRepository.findAll();
        return list;
    }


}
