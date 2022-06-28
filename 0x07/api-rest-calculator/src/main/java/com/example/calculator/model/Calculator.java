package com.example.calculator.model;

import java.time.LocalDate;

public class Calculator {
    public Double sum(Double number1, Double number2) {
        // TODO
        // validação -> throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        return number1;
    }

    public Double sub(Double number1, Double number2) {
        // TODO
        // validação -> throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        return number1;
    }

    public Double divide (Double number1, Double number2)  {
        // TODO
        // validação -> throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        // validação -> throw new ArithmeticException("Divisão por zero não é permitido.");
        return number1;
    }

    public Integer factorial(Integer factorial) {
        // TODO
        // validação -> throw new NullPointerException("Número é obrigatório.");
        return factorial;
    }

    // Exemplos:
    // Integer = 1 -> Binary = 1
    // Integer = 5 -> Binary = 101
    // Integer = 20 -> Binary = 10100
    public Integer integerToBinary(Integer integer) {
        // TODO
        return integer;
    }

    // Exemplos:
    // Integer = 1 -> Hexadecimal = "1"
    // Integer = 5 -> Hexadecimal = "37"
    // Integer = 170 -> Binary = "AA"
    public String integerToHexadecimal(Integer integer) {
        // TODO
        return null;
    }

    // Exemplos
    // Date 1 = LocalDate.of(2020, 3, 15);
    // Date 2 = LocalDate.of(2020, 3, 29)
    // Total de dias = 14
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
    // TODO
    return 0;
    }
}
