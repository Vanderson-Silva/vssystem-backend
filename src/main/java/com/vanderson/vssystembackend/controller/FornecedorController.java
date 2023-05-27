package com.vanderson.vssystembackend.controller;


import com.vanderson.vssystembackend.model.Fornecedor;
import com.vanderson.vssystembackend.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*") // recebe requisições de múltiplas fontes.
@RestController
@RequestMapping(value = "/fornecedores") //localhost:8080/fornecedores
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;


    // metodo que vai listar todos
    @GetMapping()
    public ResponseEntity<List<Fornecedor>> listarTodosFornecedores() {
        List<Fornecedor> list = fornecedorService.listarTodosFornecedores();
        return ResponseEntity.ok().body(list);
    }

}
