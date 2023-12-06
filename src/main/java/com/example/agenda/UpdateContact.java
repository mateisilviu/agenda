package com.example.agenda;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateContact {
    @NotNull
    Long id;
    @NotBlank
    String nume;
    @NotBlank
    String email;
    @NotBlank
    String telefon;
}
