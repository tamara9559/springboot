package co.edu.cue.practicaSpring_.mapping.DTO;


import jakarta.validation.constraints.NotEmpty;

public record LoginDTO(@NotEmpty(message = "Username cannot be empty")
                       String username,

                       @NotEmpty(message = "Password cannot be empty")
                       String password ) {}
