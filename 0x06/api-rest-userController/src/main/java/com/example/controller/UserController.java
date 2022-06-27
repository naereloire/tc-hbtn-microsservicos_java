package src.main.java.com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private static final Object CPF = null;

    @GetMapping("/com-id/{id}")
    public String findUserById(@PathVariable int id) {

        String msg = "";
        // TODO
        return msg;
    }

    @GetMapping("/com-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        String msg = "";
        // TODO
        return msg;
    }

    @GetMapping("/com-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        String msg = "";
//        boolean isCPFValid = isCPF(String CPF);
        // TODO
        return msg;

    }

    public boolean isCPF(String CPF) {
        // TODO
        return false;
    }
}
