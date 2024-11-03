package br.com.example.swagger.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class swaggercontroller {
    @GetMapping("/nome")
    public String Nome(@RequestParam String nome) {
        return nome;
    }

    @PostMapping("/idade")
    public String Idade(@RequestBody int idade) {
        return String.valueOf(idade);
    }
}
