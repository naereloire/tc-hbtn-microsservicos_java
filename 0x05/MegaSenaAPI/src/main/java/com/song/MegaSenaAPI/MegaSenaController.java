package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

  @GetMapping("/simpleMessageWelcome")
  public String mensagemBoasVindas() {
    String message = "Bem vindo a API REST para geração de números para a loteria Mega Sena";
    return message;
  }

  @GetMapping("/getNumbers")
  public List<Integer> numerosMegaSena() {
    List<Integer> list = new ArrayList<>();
    Random rand = new Random();
    int upperbound = 7;
    int int_random;

    for (int i = 1; i < upperbound; i++) {
      int_random = rand.nextInt(upperbound);
      list.add(int_random);
    }

    return list;
  }
}
