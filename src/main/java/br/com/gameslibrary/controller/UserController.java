package br.com.gameslibrary.controller;

import br.com.gameslibrary.model.user.User;
import br.com.gameslibrary.model.user.dto.UserCreateDTO;
import br.com.gameslibrary.model.user.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController (UserRepository userRepository) {
    this.userRepository = userRepository;
    }

    @GetMapping("/user/account")
    public String showFormRegisterUser(UserCreateDTO userCreateDTO) {
        return "user/formCreateUser";
    }
    @PostMapping("user/account/submit")
    public String submitFormRegisterUser(@ModelAttribute("userCreateDTO") @Valid  UserCreateDTO userCreateDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("userCreateDTO", userCreateDTO);
            return showFormRegisterUser(userCreateDTO);
        }
        User user = userCreateDTO.toModel(userCreateDTO);
        userRepository.save(user);
        return "redirect:/user/account";
    }

}
