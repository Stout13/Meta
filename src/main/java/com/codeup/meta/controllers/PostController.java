package com.codeup.meta.controllers;


import com.codeup.meta.models.Post;
import com.codeup.meta.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
//    @GetMapping("/")
//    public String hello() {
//        return "Hello";
//    }

//    @GetMapping(path = "/roll-dice")
//    public String showDice() {
//        return "roll-dice";
//    }


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


    public PostController(PostRepository postRepository) {
    }

//    @RequestMapping(path = "/posts", method = RequestMethod.GET)
//    @ResponseBody
//    public String postIndex() {
//        return "create";
//    }

//    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String postEntry(@PathVariable String id) {
//        return id + id;
//    }

//    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
//    @ResponseBody
//    public String postForm(@PathVariable String form) {
//        return form;
//    }

    @PostMapping(path = "/post/create")
    public String postPost(@RequestParam(name = "title") String title, @RequestParam(name = "description") String description, PostRepository postRepository) {
        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setDescription(description);
        postRepository.save(newPost);
        return "/index";
    }

    @GetMapping(path = "/create")
    public String getPost() {
        return "/create";
    }
}

//    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String subtractNumbers(@PathVariable String formData) {
//
//
//        return postForm(formData);
//    }
