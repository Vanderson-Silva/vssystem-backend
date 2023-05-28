package com.vanderson.vssystembackend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@NoArgsConstructor
@Data
public abstract class Pessoa implements Serializable {
    private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataCadastro;
    private String status;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String telefone;
    private String celular;

    public Pessoa(Long id, String nome, Date dataCadastro,
                  String status, String endereco, String numero,
                  String bairro, String cidade, String telefone,
                  String celular) {
        this.id = id;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
    }

    public Pessoa(Long id, Date dataCadastro, String status) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }
}



