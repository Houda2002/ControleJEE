package com.example.controlejee;

import com.example.controlejee.entities.Abonnements;
import com.example.controlejee.entities.Client;
import com.example.controlejee.entities.TypesAbonnements;
import com.example.controlejee.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;


@SpringBootApplication
public class ControleJeeApplication {


        public static void main(String[] args) {
            SpringApplication.run(ControleJeeApplication.class, args);
        }

        @Bean
        CommandLineRunner commandLineRunner(ClientRepository clientRepository){
            return args -> {


           clientRepository.save(new Client(null,"houda","houda@gmail.com","HOUDA"));
                clientRepository.save(new Client(null,"Hasnae","hasnae@gmail.com","hasnae"));
                clientRepository.save(new Client(null,"saad","saad@gmail.com","saad"));


                clientRepository.findAll().forEach(p->{
                    System.out.println(p.getNom());
                });








            };
        }
    }




