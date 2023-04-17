package com.vanderson.vssystembackend.controller;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/todos")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ResponseEntity<Cliente> buscarPorIdCliente(@PathVariable Long id) {
        Cliente obj = clienteService.buscarPorIdCliente(id);
        return ResponseEntity.ok().body(obj);
    }
}
