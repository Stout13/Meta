//package com.codeup.meta.models;
//
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//
//@Table(name="posts")
//@Entity
//public class Post{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public long id;
//
//    @Column
//    public String title;
//
//    @Column
//    public String description;
//
//    public Post(){
//
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}