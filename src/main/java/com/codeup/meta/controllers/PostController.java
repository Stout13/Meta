package com.codeup.meta.controllers;


import com.codeup.meta.models.Post;
import com.codeup.meta.models.PostRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.metamodel.SetAttribute;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {
    private final PostRepository postRepository;
    public PostController(PostRepository postRepository, PostRepository postRepository1) {

        this.postRepository = postRepository1;
    }

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

//    @Component
//    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public ShoppingCart implements Serializable {
//        private List<Post> posts = new ArrayList<>();
//        posts = (ArrayList<Post>) postRepository.findAll();
//
//        private Long total;
//    }

    @PostMapping(path = "/index")
    public String postIndex(Model model) {
        ArrayList<Post> posts = (ArrayList<Post>) postRepository.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }

//    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String postEntry(@PathVariable String id) {
//        return id + id;
//    }

    @GetMapping(path = "/posts/create")
    public String postForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping(path = "/post/create")
    public String postPost(@ModelAttribute Post newPost) {
        postRepository.save(newPost);

        return "index";
    }
}

//    @GetMapping(path = "/create")
//    public String getPost() {
//        return "/create";
//    }
//}

//    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String subtractNumbers(@PathVariable String formData) {
//
//
//        return postForm(formData);
//    }
