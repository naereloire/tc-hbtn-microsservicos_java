package com.example.calculator.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

  @GetMapping("/welcome")
  public String messageWelcome() {
    // TODO
    return null;
  }

  @GetMapping("/addNumbers")
  public String addNumbers(
      @RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
    // TODO
    return null;
  }

  @GetMapping("/subNumbers")
  public String subNumbers(
      @RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
    // TODO
    return null;
  }

  @GetMapping("/divideNumbers")
  public String divideNumbers(
      @RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
    // TODO
    return null;
  }

  @GetMapping("/factorial")
  public String factorial(@RequestParam(name = "factorial") Integer factorial) {
    // TODO
    return null;
  }

  @GetMapping("/calculeDayBetweenDate")
  public String calculeDayBetweenDate(
      @RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
          LocalDate localDate1,
      @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
          LocalDate localDate2) {
    // TODO
    return null;
  }

  @GetMapping("/integerToBinary")
  public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
    // TODO
    return null;
  }

  @GetMapping("/integerToHexadecimal")
  public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
    // TODO
    return null;
  }
}
