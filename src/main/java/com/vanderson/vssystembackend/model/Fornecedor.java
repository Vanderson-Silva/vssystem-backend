package com.vanderson.vssystembackend.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;


@Entity
@NoArgsConstructor
@Data
public class Fornecedor extends Pessoa {

    private String cnpj;

    public Fornecedor(Long id, String nome, Date dataCadastro, String status, String endereco,
                      String numero, String bairro, String cidade, String telefone, String celular,
                      String cnpj) {
        super(id, nome, dataCadastro, status, endereco, numero, bairro, cidade, telefone, celular);
        this.cnpj = cnpj;
    }
}
