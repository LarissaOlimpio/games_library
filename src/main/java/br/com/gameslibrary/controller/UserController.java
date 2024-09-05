package br.com.gameslibrary.controller;

import br.com.gameslibrary.model.user.dto.UserCreateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user/account")
    public String showFormRegisterUser(UserCreateDTO userCreateDTO) {
        return "user/formCreateUser";
    }
    @PostMapping("user/account/submit")
    public String submitFormRegisterUser(@ModelAttribute("userCreateDTO") UserCreateDTO userCreateDTO, BindingResult bindingResult) {
        return "redirect:/user/account";
    }

}
