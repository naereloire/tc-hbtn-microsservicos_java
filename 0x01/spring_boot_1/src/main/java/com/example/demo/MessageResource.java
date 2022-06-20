package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {

  @GetMapping("/simpleMessageWelcome")
  public String simpleMessageWelcome() {

    return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
  }

  @GetMapping("/login")
  public String login(String user, String password) {
    String result = null;
    if (user.isEmpty() || password == null) {
      result = "USUÁRIO E SENHA NÃO INFORMADOS";
    } else if (user.length() > 15 || password == null || password.length() > 15) {
      result = "USUÁRIO E SENHA INVÁLIDOS";
    } else {
      result = "LOGIN EFETUADO COM SUCESSO !!!";
    }

    return result;
  }
}
