package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
//    @GetMapping("/")
//    @ResponseBody
//    public String main() {
//        return "This is the landing page!";
//    }
    @GetMapping(path = "/add/{number1}/and/{number2}")
    @ResponseBody
    public String addNumbers(@PathVariable int number1, int number2) {

        int sum = number1 + number2;
        return (number1 + " plus " + number2 + " is " + sum + "!");
    }

    @GetMapping(path = "/subtract/{number1}/from/{number2}")
    @ResponseBody
    public String subtractNumbers(@PathVariable int number1, int number2) {

        int sum = number1 + number2;
        return (number1 + " minus " + number2 + " is " + sum + "!");
    }

    @GetMapping(path = "/subtract/{number1}/from/{number2}")
    @ResponseBody
    public String multiplyNumbers(@PathVariable int number1, int number2) {

        int product = number1 * number2;
        return (number1 + " times " + number2 + " is " + product + "!");
    }

    @GetMapping(path = "/divide/{number1}/by/{number2}")
    @ResponseBody
    public String divideNumbers(@PathVariable int number1, int number2) {

        int quotient = number1/number2;
        return (number1 + " plus " + number2 + " is " + quotient + "!");
    }
}