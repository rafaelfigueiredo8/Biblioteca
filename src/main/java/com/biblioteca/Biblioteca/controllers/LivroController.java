package com.biblioteca.Biblioteca.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroLivros dados){

        System.out.println(dados);

    }
}
