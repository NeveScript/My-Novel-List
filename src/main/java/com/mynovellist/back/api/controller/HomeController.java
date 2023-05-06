package com.mynovellist.back.api.controller;

import com.mynovellist.back.repositories.UserRepository;
import com.mynovellist.back.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/start/{id}")
    public String homePage(@PathVariable("id") long id, Model model){

        Optional<User> user = userRepository.findById(id);
        model.addAttribute("user", user);

        return "home";
    }
}
