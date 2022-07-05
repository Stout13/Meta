package com.codeup.meta.models;
import javax.persistence.*;

@Entity
@Table(name="ads")
public class Ads {

    public Long id;
    public String title;
    public String Description;

    @Entity
    public class Ad {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;

        @Column
        public String title;

        @Column
        public String Description;

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
