package com.example.iFilmWeb.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int time;
    private String description;
    private String img;
    private String video;
    private int likeM;
    private int viewM;
    private String dateUp;
   private String imgPoster;

    @ManyToOne
    Category category;
}
