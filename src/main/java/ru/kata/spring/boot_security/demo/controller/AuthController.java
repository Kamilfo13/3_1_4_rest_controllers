package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.DAO.UserDaoImpl;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserServiceImpl;

import java.security.Principal;

@Controller
public class AuthController {
    private final UserDaoImpl ud;

    public AuthController(UserDaoImpl ud) {
        this.ud = ud;
    }

    @GetMapping(value = "/user")
    public String printWelcome(ModelMap model, Principal princ) {
        User us = ud.findByName(princ.getName());
        model.addAttribute("messages", us);
        return "user";
    }
}