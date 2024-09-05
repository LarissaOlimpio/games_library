package br.com.gameslibrary.model.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "User")
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(unique = true, nullable = false)
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    @Column(unique = true, nullable = false)
    private String email;
    @NotBlank
    private String phone;
}
