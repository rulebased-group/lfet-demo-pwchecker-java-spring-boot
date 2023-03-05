package lfet.demo.pwchecker.java.spring.boot.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PasswordCheckerController {

    @GetMapping("/")
    public String redirect(Model model) {
        model.addAttribute("user", new UserDto());
        return "index";
    }

    @PostMapping("/register")
    public String register(@Valid  @ModelAttribute("user") UserDto user, BindingResult bindingResult, Model model) {
        return "index";
    }
}
