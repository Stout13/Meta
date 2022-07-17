package com.codeup.meta.controllers;



import com.codeup.meta.models.Post;
import com.codeup.meta.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class PostController {
//    @GetMapping("/")
//    @ResponseBody
//    public String hello() {
//        return "Hello";
//    }
//}

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }


//    @Component
//    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public ShoppingCart implements Serializable {
//        private List<Post> posts = new ArrayList<>();
//        posts = (ArrayList<Post>) postRepository.findAll();
//
//        private Long total;
//    }


//    @controller
//    public class PostController {
//        @GetMapping (Ov"/posts")
//        public String postsIndex(Model model)(
//                1/
//        Inside the method that shows all the posts,
//        create a new
//        objects to it, then pass that list to the view.
//                ArrayList<Post» allPosts = new ArrayList<>();
//        oni
//allPosts.add (new Post (title: "Good news - I adopted all of the
//                to my house and experience northwest San Antonio's first cat cafe called Howlin'
//                Howell's Cat C
//                WOW !")) :
//                allPosts.add(new Post (title: "New special at Howlin' Howell's Cat Cafel",
//                        body: "We'
//                                added a range of new coffee products and TV screens for LAN parties, video game parties, sports
//                                events,
//                        and otherwise! Call 210-555-5555 to make a reservation today :D"));

    @PostMapping(path = "/index")
    public String postIndex(Model model) {
        ArrayList<Post> posts = (ArrayList<Post>) postRepository.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }

    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String postEntry(@PathVariable String id) {
        return id;
    }

    @GetMapping(path = "/posts/create")
    public String postForm(Model model) {
        return "posts/create";
    }


    @GetMapping(path = "/create")
    public String postGet() {
        return "view the form for creating a post";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String postPost() {
        return "create a new post";
    }
}
