//package com.codeup.meta.controllers;
//
//import com.codeup.meta.models.PostRepository;
//import org.hibernate.mapping.List;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Optional;
//import java.util.function.Function;
//
////public class CatExample {
////
////
////@Component
////@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class ShoppingCart implements Serializable {
//
//    private PostRepository postRepository = new PostRepository() {
//        this.
//        @Override
//        public java.util.List<Post> findAll() {
//            return null;
//        }
//
//        @Override
//        public java.util.List<Post> findAll(Sort sort) {
//            return null;
//        }
//
//        @Override
//        public java.util.List<Post> findAllById(Iterable<Long> longs) {
//            return null;
//        }
//
//        @Override
//        public <S extends Post> java.util.List<S> saveAll(Iterable<S> entities) {
//            return null;
//        }
//
//        @Override
//        public void flush() {
//
//        }
//
//        @Override
//        public <S extends Post> S saveAndFlush(S entity) {
//            return null;
//        }
//
//        @Override
//        public <S extends Post> java.util.List<S> saveAllAndFlush(Iterable<S> entities) {
//            return null;
//        }
//
//        @Override
//        public void deleteAllInBatch(Iterable<Post> entities) {
//
//        }
//
//        @Override
//        public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//        }
//
//        @Override
//        public void deleteAllInBatch() {
//
//        }
//
//        @Override
//        public Post getOne(Long aLong) {
//            return null;
//        }
//
//        @Override
//        public Post getById(Long aLong) {
//            return null;
//        }
//
//        @Override
//        public Post getReferenceById(Long aLong) {
//            return null;
//        }
//
//        @Override
//        public <S extends Post> java.util.List<S> findAll(Example<S> example) {
//            return null;
//        }
//
//        @Override
//        public <S extends Post> java.util.List<S> findAll(Example<S> example, Sort sort) {
//            return null;
//        }
//
//        @Override
//        public Page<Post> findAll(Pageable pageable) {
//            return null;
//        }
//
//        @Override
//        public <S extends Post> S save(S entity) {
//            return null;
//        }
//
//        @Override
//        public Optional<Post> findById(Long aLong) {
//            return Optional.empty();
//        }
//
//        @Override
//        public boolean existsById(Long aLong) {
//            return false;
//        }
//
//        @Override
//        public long count() {
//            return 0;
//        }
//
//        @Override
//        public void deleteById(Long aLong) {
//
//        }
//
//        @Override
//        public void delete(Post entity) {
//
//        }
//
//        @Override
//        public void deleteAllById(Iterable<? extends Long> longs) {
//
//        }
//
//        @Override
//        public void deleteAll(Iterable<? extends Post> entities) {
//
//        }
//
//        @Override
//        public void deleteAll() {
//
//        }
//
//        @Override
//        public <S extends Post> Optional<S> findOne(Example<S> example) {
//            return Optional.empty();
//        }
//
//        @Override
//        public <S extends Post> Page<S> findAll(Example<S> example, Pageable pageable) {
//            return null;
//        }
//
//        @Override
//        public <S extends Post> long count(Example<S> example) {
//            return 0;
//        }
//
//        @Override
//        public <S extends Post> boolean exists(Example<S> example) {
//            return false;
//        }
//
//        @Override
//        public <S extends Post, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//            return null;
//        }
//    }
//
//
//
//private List<Post> posts = new ArrayList<>();
//        posts = (ArrayList<Post>) postRepository.findAll();
//
//private Long total;
//        }
//
//
//
//@Controller
//public class PostController {
//    @GetMapping("/posts")
//    public String postsIndex(Model model)(
////            1/
////    Inside the method that shows all the posts,
////    create a new
////    objects to it, then pass that list to the view.
//            ArrayList<Post» allPosts = new ArrayList<>();
//    oni
//allPosts.add (new Post (title: "Good news - I adopted all of the
//            to my house and experience northwest San Antonio's first cat cafe called Howlin'
//            Howell's Cat C
//            WOW !")) :
//            allPosts.add(new Post (title: "New special at Howlin' Howell's Cat Cafel",
//                        body: "We'
//                                added a range of new coffee products and TV screens for LAN parties, video game parties, sports
//                                events,
//                        and otherwise! Call 210-555-5555 to make a reservation today :D"));
