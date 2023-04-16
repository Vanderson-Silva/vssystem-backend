package com.vanderson.vssystembackend;

import com.vanderson.vssystembackend.model.Cliente;
import com.vanderson.vssystembackend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


@SpringBootApplication
public class VssystemBackendApplication implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(VssystemBackendApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Cliente cliente = new Cliente(null, "Andre Eloy",LocalDateTime.parse("25/03/2025 10:40",formatter),
                LocalDateTime.parse("12/04/2014 15:45",formatter),"M","A","045.607.789-41","10.446.789-8",
                "Rua B","456","Casa","San Rafael","Arapongas","86703-892","PR","433275-2548","4398841-8744",
                "andre@hotmail.com","Testando aplicacao");
        Cliente cliente1 = new Cliente(null, "Andre Eloy",LocalDateTime.parse("25/03/2025 10:40",formatter),
                LocalDateTime.parse("12/04/2014 15:45",formatter),"M","A","045.607.789-41","10.446.789-8",
                "Rua B","456","Casa","San Rafael","Arapongas","86703-892","PR","433275-2548","4398841-8744",
                "andre@hotmail.com","Testando aplicacao");
        Cliente cliente2 = new Cliente(null, "Andre Eloy",LocalDateTime.parse("25/03/2025 10:40",formatter),
                LocalDateTime.parse("12/04/2014 15:45",formatter),"M","A","045.607.789-41","10.446.789-8",
                "Rua B","456","Casa","San Rafael","Arapongas","86703-892","PR","433275-2548","4398841-8744",
                "andre@hotmail.com","Testando aplicacao");
        Cliente cliente3 = new Cliente(null, "Andre Eloy",LocalDateTime.parse("25/03/2025 10:40",formatter),
                LocalDateTime.parse("12/04/2014 15:45",formatter),"M","A","045.607.789-41","10.446.789-8",
                "Rua B","456","Casa","San Rafael","Arapongas","86703-892","PR","433275-2548","4398841-8744",
                "andre@hotmail.com","Testando aplicacao");
        Cliente cliente4 = new Cliente(null, "Andre Eloy",LocalDateTime.parse("25/03/2025 10:40",formatter),
                LocalDateTime.parse("12/04/2014 15:45",formatter),"M","A","045.607.789-41","10.446.789-8",
                "Rua B","456","Casa","San Rafael","Arapongas","86703-892","PR","433275-2548","4398841-8744",
                "andre@hotmail.com","Testando aplicacao");
        Cliente cliente5 = new Cliente(null, "Andre Eloy",LocalDateTime.parse("25/03/2025 10:40",formatter),
                LocalDateTime.parse("12/04/2014 15:45",formatter),"M","A","045.607.789-41","10.446.789-8",
                "Rua B","456","Casa","San Rafael","Arapongas","86703-892","PR","433275-2548","4398841-8744",
                "andre@hotmail.com","Testando aplicacao");


        clienteRepository.saveAll(Arrays.asList(cliente,cliente1,cliente2,cliente3,cliente4,cliente5));

    }
}
