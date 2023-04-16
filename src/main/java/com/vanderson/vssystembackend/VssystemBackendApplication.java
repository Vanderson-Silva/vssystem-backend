package com.vanderson.vssystembackend;

import com.vanderson.vssystembackend.model.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@SpringBootApplication
public class VssystemBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(VssystemBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Cliente cliente = new Cliente(null, "Andre Eloy", LocalDateTime.parse("12/04/1955"),
                LocalDateTime.parse("24/08/2021"), "M", "A", "042.567.489-41", "10.226.567-8",
                "Besourinho Ametista", "592", "Casa", "San Rafael", "Arapongas",
                "86703-789", "PR", "4398865-4177", "433275-5614",
                "andresilva@hotmail.com", "Testando aplicacao");
    }


}
