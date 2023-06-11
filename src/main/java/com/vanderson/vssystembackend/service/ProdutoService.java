package com.vanderson.vssystembackend.service;


import com.vanderson.vssystembackend.model.Produto;
import com.vanderson.vssystembackend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.JobExecutionExitCodeGenerator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Metodo de busca pelo Id
    public Produto findById(Long id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj.orElse(null);
    }


    // metodo para listar todos os produtos.
    public List<Produto> listarTodosProdutos() {
        List<Produto> list = produtoRepository.findAll();
        return list;
    }

    // metodo para excluir um produto
    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    //metodo para salvar um produto
    public Produto create(Produto obj) {
        obj.setId(null);
        return produtoRepository.save(obj);
    }

    // metodo para editar um cliente
    public Produto update(Long id, Produto obj) {
        Produto produto = findById(id);
        produto.setReferencia(obj.getReferencia());
        produto.setDescricao(obj.getDescricao());
        produto.setDataCadastro(obj.getDataCadastro());
        produto.setStatus(obj.getStatus());
        produto.setQtdmlprod(obj.getQtdmlprod());
        produto.setValorCompra(obj.getValorCompra());
        produto.setValorVenda(obj.getValorVenda());
        produto.setFornecedor(obj.getFornecedor());
        produto.setQdtEstoque(obj.getQdtEstoque());
        return produtoRepository.save(obj);


    }
}