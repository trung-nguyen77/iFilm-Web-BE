package com.example.iFilmWeb.service.impl;

import com.example.iFilmWeb.model.Comment;
import com.example.iFilmWeb.model.query.CommentCount;
import com.example.iFilmWeb.repository.CommentRepo;
import com.example.iFilmWeb.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepo.findAll();
    }

    @Override
    public List<Comment> findCommentsByMovie_Id(int id) {
        return commentRepo.findCommentsByMovie_Id(id);
    }


    @Override
    public Comment save(Comment comment) {
        commentRepo.save(comment);
        return comment;
    }

    @Override
    public List<CommentCount> getListIdByCount() {
        return commentRepo.getListIdByCount();
    }

}
