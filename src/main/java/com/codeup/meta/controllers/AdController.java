//package com.codeup.meta.controllers;
//
//import com.codeup.meta.models.Ad;
//import com.codeup.meta.models.AdRepository;
//import com.codeup.meta.models.PostRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//
//public class AdController {
//
//        // These two next steps are often called dependency injection, where we create a Repository instance and initialize it in the controller class constructor.
//        private com.codeup.meta.models.AdRepository adsRepository;
//
//        AdController(AdRepository adsRepository){
//            this.adsRepository = adsRepository;
//        }
////
////        public AdController(com.codeup.meta.models.AdRepository adRepository) {
////            this.adsRepository = adRepository;
////        }
//
//        @GetMapping("/ads")
//        public String index(Model model) {
//            model.addAttribute("ads", adsRepository.findAll());
//            return "ads/index";
//        }
//

//        @PostMapping("ads/create")
//            public String postAd(@RequestParam(name="title") String title, @RequestParam(name="description") String description){
//
//            newAd.setTitle(title);
//            newAd.setDescription(description);
//
//            adsRepository.save(newAd);
//                return redirect:/ads;
//            }
//}