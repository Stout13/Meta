package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PostController {


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

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String subtractNumbers(@PathVariable String formData) {


        return postForm(formData);
    }
}
