package com.vanderson.vssystembackend.controller;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin("*") // recebe requisições de múltiplas fontes.
@RestController
@RequestMapping(value = "/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // metodo de busca por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> buscarPorIdCliente(@PathVariable Long id) {
        Cliente obj = clienteService.buscarPorIdCliente(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/clientes")
    public ResponseEntity<List<Cliente>> listarTodosClientes() {
        List<Cliente> list = clienteService.listarTodosClientes();
        return ResponseEntity.ok().body(list);
    }
    @DeleteMapping(value = "/clientes/{id}")
    public ResponseEntity<Cliente>delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente obj){
        obj = clienteService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
