package com.codeup.meta.models;

import javax.persistence.*;

@Table(name="posts")
@Entity
public class Post{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    public String title;

    @Column
    public String description;

    public Post(){

    }

//    public Post(long id, String title, String description) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}