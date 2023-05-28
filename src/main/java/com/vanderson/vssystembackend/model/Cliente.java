package com.vanderson.vssystembackend.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import java.util.Date;


@Entity
@NoArgsConstructor
@Data
public class Cliente extends Pessoa {


    private String cpf;


    public Cliente(Long id, String nome,String cpf, Date dataCadastro, String status, String endereco, String numero,
                   String bairro, String cidade, String telefone, String celular) {
        super(id, nome, dataCadastro, status, endereco, numero, bairro, cidade, telefone, celular);
        this.cpf = cpf;
    }


}
