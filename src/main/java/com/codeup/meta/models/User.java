package com.codeup.meta.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    protected long user_id;

    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String password;


    public User () {}


    public User(User copy) {
        user_id = copy.user_id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

