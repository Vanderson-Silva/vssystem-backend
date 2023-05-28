package com.vanderson.vssystembackend.service;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.model.Fornecedor;
import com.vanderson.vssystembackend.repository.ClienteRepository;
import com.vanderson.vssystembackend.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


@Service
public class BDService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Bean
    public void instanciaBaseDeDados() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Cliente cliente = new Cliente(null, "Vanderson", "123", simpleDateFormat.parse("12/04/2014"),
                "Ativo", "Rua B", "456", "Santos", "Arap", "4332457878", "45666");
        Cliente cliente1 = new Cliente(null, "Vanderson", "123", simpleDateFormat.parse("12/04/2014"),
                "Ativo", "Rua B", "456", "Santos", "Arap", "4332457878", "45666");
        Cliente cliente2 = new Cliente(null, "Vanderson", "123", simpleDateFormat.parse("12/04/2014"),
                "Ativo", "Rua B", "456", "Santos", "Arap", "4332457878", "45666");
        Cliente cliente3 = new Cliente(null, "Vanderson", "123", simpleDateFormat.parse("12/04/2014"),
                "Ativo", "Rua B", "456", "Santos", "Arap", "4332457878", "45666");
        Cliente cliente4 = new Cliente(null, "Vanderson", "123", simpleDateFormat.parse("12/04/2014"),
                "Ativo", "Rua B", "456", "Santos", "Arap", "4332457878", "45666");


        Fornecedor fornecedor = new Fornecedor(null, "Moveis", simpleDateFormat.parse("12/04/2014"), "Ativo", "Rua V", "456",
                "Santos", "Araponga", "'12233", "12445", "45551111");


        Fornecedor fornecedor1 = new Fornecedor(null, "Moveis", simpleDateFormat.parse("12/04/2014"), "Ativo", "Rua V", "456",
                "Santos", "Araponga", "'12233", "12445", "45551111");

        Fornecedor fornecedor2 = new Fornecedor(null, "Moveis", simpleDateFormat.parse("12/04/2014"), "Ativo", "Rua V", "456",
                "Santos", "Araponga", "'12233", "12445", "45551111");

        Fornecedor fornecedor3 = new Fornecedor(null, "Moveis", simpleDateFormat.parse("12/04/2014"), "Ativo", "Rua V", "456",
                "Santos", "Araponga", "'12233", "12445", "45551111");

        Fornecedor fornecedor4 = new Fornecedor(null, "Moveis", simpleDateFormat.parse("12/04/2014"), "Ativo", "Rua V", "456",
                "Santos", "Araponga", "'12233", "12445", "45551111");


        clienteRepository.saveAll(Arrays.asList(cliente, cliente1, cliente2, cliente3, cliente4));
        fornecedorRepository.saveAll(Arrays.asList(fornecedor1, fornecedor2, fornecedor3, fornecedor4));


    }

}
