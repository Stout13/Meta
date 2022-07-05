package com.codeup.meta.models;


import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ads, Long> {
        Ads findAll(String title);
        Ads findByTitle(String title); // select * from ads where title = ?
        Ads findFirstByTitle(String title); // select * from ads where title = ? limit 1
    }
