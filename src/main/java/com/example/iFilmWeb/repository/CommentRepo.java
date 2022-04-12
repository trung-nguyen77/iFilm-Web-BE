package com.example.iFilmWeb.repository;

import com.example.iFilmWeb.model.Comment;
import com.example.iFilmWeb.model.query.CommentCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface CommentRepo extends PagingAndSortingRepository<Comment, Integer> {
    List<Comment> findCommentsByMovie_Id(int id);


    @Query(nativeQuery = true,value = "select comment.movie_id as movieId,count(comment.movie_id) as countMovie from comment group by comment.movie_id order by countMovie desc limit 5")
    List<CommentCount> getListIdByCount();

}
