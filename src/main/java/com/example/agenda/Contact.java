package com.example.agenda;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue
    Long id;

    String nume;
    String email;
    String telefon;
}
