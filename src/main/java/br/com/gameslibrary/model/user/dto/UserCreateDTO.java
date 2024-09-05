package br.com.gameslibrary.model.user.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class UserCreateDTO {
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

    public @NotBlank String getUsername() {
        return username;
    }

    public @NotBlank String getPassword() {
        return password;
    }

    public @NotBlank String getEmail() {
        return email;
    }

    public @NotBlank String getPhone() {
        return phone;
    }
}
