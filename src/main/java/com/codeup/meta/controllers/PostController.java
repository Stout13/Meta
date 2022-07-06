package com.codeup.meta.controllers;

import com.codeup.meta.models.Post;
import com.codeup.meta.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {

    public PostController(PostRepository postRepository) {
    }




    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postIndex() {


        return "";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postEntry(@PathVariable String id) {


        return id + id;
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String postForm(@PathVariable String form) {
        return form;
    }

    @PostMapping(path = "/posts/create")
    public String postPost(@RequestParam(name = "title") String title, @RequestParam(name = "description") String description, PostRepository postRepository) {
        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setDescription(description);
        postRepository.save(newPost);
        return "Hello";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String subtractNumbers(@PathVariable String formData) {


        return postForm(formData);
    }
}
