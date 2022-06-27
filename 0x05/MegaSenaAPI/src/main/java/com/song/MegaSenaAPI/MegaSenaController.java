package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
       String message = "Bem vindo a API REST para geração de números para a loteria Mega Sena";
        return message;
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        // TODO
        // Obs: Retornar os números gerados em ordem crescente.
        return null;
    }
}