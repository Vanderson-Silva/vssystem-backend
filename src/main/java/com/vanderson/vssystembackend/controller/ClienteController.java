package com.vanderson.vssystembackend.controller;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*") // receber requisiçoes de multiplas fontes.
@RestController
@RequestMapping(value = "/todos")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // metodo de busca por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> buscarPorIdCliente(@PathVariable Long id) {
        Cliente obj = clienteService.buscarPorIdCliente(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodosClientes() {
        List<Cliente> list = clienteService.listarTodosClientes();
        return ResponseEntity.ok().body(list);
    }
}
