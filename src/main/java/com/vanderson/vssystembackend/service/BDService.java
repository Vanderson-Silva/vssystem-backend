package com.vanderson.vssystembackend.service;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.repository.ClienteRepository;

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

    @Bean
    public void instanciaBaseDeDados() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Cliente cliente = new Cliente(null, "Andre Eloy", simpleDateFormat.parse("25/03/2025"),
                simpleDateFormat.parse("12/04/2014"), "A",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente1 = new Cliente(null, "Andre Eloy", simpleDateFormat.parse("25/03/2025"),
                simpleDateFormat.parse("12/04/2014 "), "A",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente2 = new Cliente(null, "Andre Eloy", simpleDateFormat.parse("25/03/2025"),
                simpleDateFormat.parse("12/04/2014"), "A",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente3 = new Cliente(null, "Andre Eloy", simpleDateFormat.parse("25/03/2025 "),
                simpleDateFormat.parse("12/04/2014 "), "A",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente4 = new Cliente(null, "Andre Eloy", simpleDateFormat.parse("25/03/2025 "),
                simpleDateFormat.parse("12/04/2014 "), "A",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");

        Cliente cliente5 = new Cliente(null, "Andre Eloy", simpleDateFormat.parse("25/03/2025"),
                simpleDateFormat.parse("12/04/2014 "), "A",
                "Rua B", "456", "San Rafael", "Arapongas", "433275-2548", "4398841-8744");


        clienteRepository.saveAll(Arrays.asList(cliente, cliente1, cliente2, cliente3, cliente4, cliente5));
    }

}
