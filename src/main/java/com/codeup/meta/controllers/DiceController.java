//package com.codeup.meta.controllers;
//import com.codeup.meta.models.Post;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class DiceController {
//    //
////
////    @GetMapping("/")
////    public String hello() {
////        return "Hello";
////    }
////
//    @GetMapping(path = "/roll-dice")
//    public String showDice(@ModelAttribute Model model) {
//        String newTitle = "The best blog post ever";
//        model.addAttribute("title", newTitle);
//
//        return "roll-dice";
//    }
//
////
////
//    @PostMapping(path = "/roll-dice")
//    public String rollDice(@RequestParam(name = "guess") Integer guess, Model model) {
//        int roll = (int) Math.ceil(Math.random() * 5 + 1);
//        String result;
//        if (guess == roll) {
//            result = "Nice, " + guess + " was correct! How do you do it?!";
//        } else {
//            result = "Dude " + guess + "? Do you even Vegas bruh?! The dice roll was a " + roll;
//        }
//        model.addAttribute("result", result);
//        return "roll-dice";
//    }
//}
////
////        @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
////        @ResponseBody
////        public String postEntry(@PathVariable String id) {
////
////
////            return id + id;
////        }
////
////        @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
////        @ResponseBody
////        public String postForm(@PathVariable String form) {
////
////
////            return form;
////        }
////
//////        @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//////        @ResponseBody
//////        public String subtractNumbers(@PathVariable String formData) {
//////
//////
//////            return postForm(formData);
//////        }
////    }
//
////    @GetMapping(path = "/roll-dice")
////    public String showDice() {
////        return "roll-dice";
////    }
////
////
////    @PostMapping(path = "/roll-dice")
////    public String rollDice(@RequestParam(name = "guess") Double guess, @ModelAttribute Model model) {
////        String roll;
////        if (guess == Math.floor(Math.random() * 100) * 5 + 1) {
////            roll = "Nice" + guess + " was correct! How do you do it?!";
////        } else {
////            roll = "Dude" + guess + "? Do you even Vegas bruh?!";
////        }
////
////        model.addAttribute("roll", roll);
////        return "roll-dice";
////    }
//}