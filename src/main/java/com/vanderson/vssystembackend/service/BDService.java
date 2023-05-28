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

        Cliente cliente = new Cliente(null, "Vanderson Raimundo da Silva","123", simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente1 = new Cliente(null, "Sirlei Aparecida Venzel Sarto","123",
                simpleDateFormat.parse("12/04/2014 "), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente2 = new Cliente(null, "Claudemir Alves da Silva","123",
                simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente3 = new Cliente(null, "Robson da Silva de Carvalho","123",
                simpleDateFormat.parse("12/04/2014 "), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente4 = new Cliente(null, "Fernanda","123",
                simpleDateFormat.parse("12/04/2014 "), "Inativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente5 = new Cliente(null, "Casemiro","123",
                simpleDateFormat.parse("12/04/2014 "), "Inativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");



        Fornecedor fornecedor1 = new Fornecedor(null, "Moveis Belas Artes", "1231212.0001/45", simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Fornecedor fornecedor2 = new Fornecedor(null, "DJ Moveis", "1231212.0001/45", simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Fornecedor fornecedor3 = new Fornecedor(null, "Colibri", "1231212.0001/45", simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Fornecedor fornecedor4 = new Fornecedor(null, "Vamol", "1231212.0001/45", simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Fornecedor fornecedor5 = new Fornecedor(null, "Moval", "1231212.0001/45", simpleDateFormat.parse("12/04/2014"), "Ativo",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        clienteRepository.saveAll(Arrays.asList(cliente, cliente1, cliente2, cliente3, cliente4, cliente5));
        fornecedorRepository.saveAll(Arrays.asList(fornecedor1, fornecedor2, fornecedor3, fornecedor4, fornecedor5));


    }

}
