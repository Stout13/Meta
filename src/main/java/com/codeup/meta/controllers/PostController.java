//package com.codeup.meta.controllers;
//
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//
//@Controller
//public class PostController {
//    @GetMapping("/")
//    @ResponseBody
//    public String hello() {
//        return "Hello";
//    }
//}

//    private final PostRepository postRepository;
//
//    public PostController(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }


//    public PostController(PostRepository postRepository1) {
//
//        this.postRepository = postRepository1;
//    }

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
//
//    @PostMapping(path = "/index")
//    public String postIndex(Model model) {
//        ArrayList<Post> posts = (ArrayList<Post>) postRepository.findAll();
//        model.addAttribute("posts", posts);
//        return "index";
//    }

//    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String postEntry(@PathVariable String id) {
//        return id + id;
//    }

//    @GetMapping(path = "/posts/create")
//    public String postForm(Model model) {
//        model.addAttribute("post", new Post());
//        return "posts/create";
//    }
//
//    @PostMapping(path = "/post/create")
//    public String postPost(@ModelAttribute Post newPost) {
//        postRepository.save(newPost);
//
//        return "index";
//    }


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
