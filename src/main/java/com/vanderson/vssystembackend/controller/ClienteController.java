package com.vanderson.vssystembackend.controller;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.net.URI;
import java.util.List;

@CrossOrigin("*") // recebe requisições de múltiplas fontes.
@RestController
@RequestMapping(value = "/clientes") //localhost:8080/clientes
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private EntityManager entityManager;

    // metodo de busca por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> buscarPorIdCliente(@PathVariable Long id) {
        Cliente obj = clienteService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // metodo que vai listar todos
    @GetMapping()
    public ResponseEntity<List<Cliente>> listarTodosClientes() {
        TypedQuery<Cliente> query = entityManager.createQuery("SELECT c FROM Cliente c  ORDER BY c.id", Cliente.class);
        List<Cliente> list = query.getResultList();
        return ResponseEntity.ok().body(list);
    }
    @DeleteMapping(value = "/{id}")
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

    @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id,@RequestBody Cliente obj){
        Cliente cliente = clienteService.update(id,obj);
        return ResponseEntity.ok().body(cliente);
    }
}
