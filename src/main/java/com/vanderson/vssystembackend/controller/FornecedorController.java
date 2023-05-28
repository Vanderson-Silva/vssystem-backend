package com.vanderson.vssystembackend.controller;


import com.vanderson.vssystembackend.model.Fornecedor;
import com.vanderson.vssystembackend.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin("*") // recebe requisições de múltiplas fontes.
@RestController
@RequestMapping(value = "/fornecedores") //localhost:8080/fornecedores
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    // metodo de busca por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Fornecedor> buscarPorIdFornecedor(@PathVariable Long id) {
        Fornecedor obj = fornecedorService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // metodo que vai listar todos
    @GetMapping()
    public ResponseEntity<List<Fornecedor>> listarTodosFornecedores() {
        List<Fornecedor> list = fornecedorService.listarTodosFornecedores();
        return ResponseEntity.ok().body(list);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Fornecedor>delete(@PathVariable Long id){
        fornecedorService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Fornecedor> create(@RequestBody Fornecedor fornecedor){
        fornecedor = fornecedorService.create(fornecedor);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(fornecedor.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Fornecedor> update(@PathVariable Long id,@RequestBody Fornecedor obj){
        Fornecedor fornecedor = fornecedorService.update(id,obj);
        return ResponseEntity.ok().body(fornecedor);
    }
}
