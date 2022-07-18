package com.codeup.meta.models;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long post_id;

    @Column
    private String title;

    @Column
    private String description;

    public Post() {

    }

    public long getId() {
        return post_id;
    }

    public void setId(long id) {
        this.post_id = id;
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