package com.vanderson.vssystembackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;


@Entity
@NoArgsConstructor
@Data
public class Produto extends Pessoa {

    private String referencia;
    private String descricao;
    private String qtdmlprod;
    private Double valorCompra;
    private Double valorVenda;
    private String fornecedor;
    private int qdtEstoque;

    public Produto(Long id, String referencia, String descricao, Date dataCadastro, String status,
                   String qtdmlprod, Double valorCompra, Double valorVenda, String fornecedor, int qdtEstoque) {
        super(id, dataCadastro, status);
        this.referencia = referencia;
        this.descricao = descricao;
        this.qtdmlprod = qtdmlprod;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.fornecedor = fornecedor;
        this.qdtEstoque = qdtEstoque;
    }
}
