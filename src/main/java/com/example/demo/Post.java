package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.DateFormat;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min=3)
    private String name;

    /*@DateTimeFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)*/
    @NotNull
    /*@Size(min=8,max=8)*/
    private String date;
    @NotNull
    @Size(min=3,max=150)
    private String subject;
    @NotNull

    private String wish;
    public Post() {
    }


    public Post(@NotNull @Size(min = 3) String name, @NotNull @Size(min = 8, max = 8) String date, @NotNull @Size(min = 3, max = 80) String subject, @Size(min = 10) String wish) {
        this.name = name;
        this.date = date;
        this.subject = subject;
        this.wish = wish;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }
}
