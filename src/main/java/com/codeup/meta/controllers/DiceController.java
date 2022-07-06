//package com.codeup.meta.controllers;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class DiceController {
//
//
//    @GetMapping("/")
//    public String hello() {
//        return "Hello";
//    }
//
//    @GetMapping(path = "/roll-dice")
//    public String showDice() {
//        return "roll-dice";
//    }
//
//
//    @PostMapping(path = "/roll-dice")
//    public String rollDice(@RequestParam(name = "guess") Double guess, Model model) {
//        String roll;
//        if (guess == Math.floor(Math.random() * 100) * 5 + 1) {
//            roll = "Nice" + guess + " was correct! How do you do it?!";
//        } else {
//            roll = "Dude" + guess + "? Do you even Vegas bruh?!";
//        }
//
//        model.addAttribute("roll", roll);
//        return "roll-dice";
//    }
//
//        @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//        @ResponseBody
//        public String postEntry(@PathVariable String id) {
//
//
//            return id + id;
//        }
//
//        @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
//        @ResponseBody
//        public String postForm(@PathVariable String form) {
//
//
//            return form;
//        }
//
////        @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
////        @ResponseBody
////        public String subtractNumbers(@PathVariable String formData) {
////
////
////            return postForm(formData);
////        }
//    }