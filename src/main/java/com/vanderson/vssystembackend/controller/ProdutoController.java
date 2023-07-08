package com.vanderson.vssystembackend.controller;

import com.vanderson.vssystembackend.model.Produto;
import com.vanderson.vssystembackend.service.ProdutoService;
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
@RequestMapping(value = "/produtos") //localhost:8080/produtos
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private EntityManager entityManager;

    // metodo de busca por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> buscarPorIdProduto(@PathVariable Long id) {
        Produto obj = produtoService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // metodo que vai listar todos
    @GetMapping()
    public ResponseEntity<List<Produto>> listarTodosProdutos() {
        TypedQuery<Produto> query = entityManager.createQuery("SELECT p FROM Produto p  ORDER BY p.id", Produto.class);
        List<Produto> list = query.getResultList();
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Produto> delete(@PathVariable Long id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        produto = produtoService.create(produto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
         produto = produtoService.update(id, produto);
        return ResponseEntity.ok().body(produto);
    }
}
