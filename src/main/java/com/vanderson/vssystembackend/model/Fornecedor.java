package com.vanderson.vssystembackend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
@NoArgsConstructor
@Data
public class Fornecedor implements Serializable {
    private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpj;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataCadastro;
    private String status;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String telefone;
    private String celular;


    public Fornecedor(Long id, String nome,String cnpj, Date dataCadastro,
                      String status, String endereco, String numero,
                      String bairro, String cidade, String telefone,
                      String celular) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
    }


}
