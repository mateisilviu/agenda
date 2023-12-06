package com.example.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class CommandLine implements CommandLineRunner {

    final ContactRepository contactRepository;

    @Override
    public void run(String... args) throws Exception {

        // Contact c1 = new
        // Contact().setEmail("mail").setNume("name").setTelefon("072");
        // contactRepository.save(c1);

    }

}
