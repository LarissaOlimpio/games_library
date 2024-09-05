package br.com.gameslibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class GameLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLibraryApplication.class, args);
    }
}
