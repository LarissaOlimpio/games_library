package br.com.gameslibrary.model.user;

import br.com.gameslibrary.model.user.dto.UserCreateDTO;
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

    public User() {}

    public User(UserCreateDTO userCreateDTO) {
        this.username = userCreateDTO.getUsername();
        this.password = userCreateDTO.getPassword();
        this.email = userCreateDTO.getEmail();
        this.phone = userCreateDTO.getPhone();
    }


}
