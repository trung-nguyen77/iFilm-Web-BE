package com.example.iFilmWeb.service;

import com.example.iFilmWeb.model.Comment;
import com.example.iFilmWeb.model.query.CommentCount;

import java.util.List;

public interface ICommentService {
    public List<Comment> findAll();
    List<Comment> findCommentsByMovie_Id(int id);
    Comment save(Comment comment);
    List<CommentCount> getListIdByCount();
}
