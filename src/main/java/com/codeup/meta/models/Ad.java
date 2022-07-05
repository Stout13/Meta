package com.codeup.meta.models;
import javax.persistence.*;

@Table(name="ads")
@Entity
public class Ad {

    public Ad(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    public String title;

    @Column
    public String Description;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
