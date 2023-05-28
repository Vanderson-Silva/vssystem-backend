package com.vanderson.vssystembackend.controller;



import com.vanderson.vssystembackend.model.Cliente;
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
    public ResponseEntity<Fornecedor> create(@RequestBody Fornecedor obj){
        obj = fornecedorService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
