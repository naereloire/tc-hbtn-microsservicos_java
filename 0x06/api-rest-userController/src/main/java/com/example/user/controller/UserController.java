package src.main.java.com.example.user.controller;

import com.example.user.exception.CPFException;
import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;
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
        String msg = "You have entered invalid ID";
        if (id > 0 && id < 100) {
            msg = "You have entered valid ID";
        }
      throw new UserIdException();
    }

    @GetMapping("/com-name/{userName}")
    public String findUserByName(@PathVariable String userName) {
        String msg = "You have entered invalid USERNAME";
        if (userName.length() > 3 && userName.length() < 15) {
            msg = "You have entered valid USERNAME";
        }
        throw new UserNameException();
    }

    @GetMapping("/com-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {
        String msg = "You have entered invalid CPF";
        if (cpf.length() > 3 && cpf.length() < 15) {
            msg = "You have entered valid CPF";
        }
        throw new CPFException();
    }

    public boolean isCPF(String CPF) {
        // TODO
        return false;
    }
}
