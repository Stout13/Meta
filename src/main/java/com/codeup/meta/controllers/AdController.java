package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AdController<AdRepository> {

        // These two next steps are often called dependency injection, where we create a Repository instance and initialize it in the controller class constructor.
        private final com.codeup.meta.models.AdRepository adRepository;

        public AdController(com.codeup.meta.models.AdRepository adRepository) {
            this.adRepository = adRepository;
        }

        @GetMapping("/ads")
        public String index(Model model) {
            model.addAttribute("ads", adRepository.findAll());
            return "ads/index";
        }

//    private Object findAll() {
//
//        return null;
//    }
}
