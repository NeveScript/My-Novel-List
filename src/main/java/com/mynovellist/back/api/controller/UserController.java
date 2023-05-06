package com.mynovellist.back.api.controller;

import com.mynovellist.back.model.User;
import com.mynovellist.back.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/sign-up")
    public String signUp(Model model){

        model.addAttribute("user", new User());

        return "sign-up";
    }

    @PostMapping("/save")
    public String save(@Valid User user, BindingResult results, RedirectAttributes attributes){

        if(results.hasErrors())
            return "sign-up";

        userRepository.save(user);
        attributes.addFlashAttribute("message", "Cadastro realizado com sucesso!");

        return "/login";
    }

    @GetMapping("/validate")
    public String confirmLogin(@RequestParam("email") String email, @RequestParam("password") String password){

        User user = userRepository.findByEmailAndPassword(email, password);

        if(user == null)
            return "sign-up";

        String id = String.valueOf(user.getId());

        return "redirect:/home/start/" + id;
    }
}
