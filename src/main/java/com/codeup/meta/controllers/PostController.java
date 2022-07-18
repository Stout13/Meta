package com.codeup.meta.controllers;


import com.codeup.meta.models.Post;
import com.codeup.meta.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping(path = "/")
    @ResponseBody
    public String home() {
        return "You did it";
    }

}
//
//    private final PostRepository postRepository;
//
//    public PostController(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
////    @GetMapping(path = "/index")
////    public String postIndex(@ModelAttribute Model model) {
//////        ArrayList<Post> posts = (ArrayList<Post>) postRepository.findAll();
//////        model.addAttribute("posts", posts);
////        Post postOne = new Post();
////        Post postTwo = new Post();
////        postOne.setId(1);
////        postOne.setDescription("this is what it is");
////        postOne.setTitle("The Thing Itself");
////
////        postTwo.setId(2);
////        postTwo.setDescription("The story about this other one is...");
////        postTwo.setTitle("This is its NAME");
////        ArrayList<Post> posts = new ArrayList<>();
////        posts.add(postOne);
////        posts.add(postTwo);
////        model.addAttribute("posts", posts);
////        return "index";
////    }
//
//
////    @GetMapping(path = "/show")
////    public String postEntry(@ModelAttribute Model model) {
////        Post thisPost = new Post();
////        thisPost.setId(10);
////        thisPost.setTitle("thatOtherThing");
////        thisPost.setDescription("The stuff I would say about this one");
////        model.addAttribute("newpost", thisPost);
////        return "show";
////    }
//    @GetMapping(path = "/index")
//    public String index(@ModelAttribute Model model) {
//        ArrayList<Post> posts = (ArrayList<Post>) postRepository.findAll();
//        model.addAttribute("posts", posts);
//        return "posts/index";
//    }
////
//    @GetMapping(path = "/post/form")
//    public String postform(@ModelAttribute Model model) {
//        Post post = new Post();
//        model.addAttribute(post);
//        return "posts/create";
//    }
////
//    @PostMapping(path = "/post")
//    @ResponseBody
//    public String postSave(@ModelAttribute Post post) {
//        postRepository.save(post);
//        return "posts/index";
//    }
////
////
////    @GetMapping(path = "/create")
////    public String getPost() {
////        return "create";
////    }
//}
//
