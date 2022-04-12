package com.example.iFilmWeb.repository;

import com.example.iFilmWeb.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface MovieRepo extends PagingAndSortingRepository<Movie, Integer> {
//    Page<Movie> findAllByNameContaining(Pageable pageable, String name);
    Page<Movie> findAll(Pageable pageable);
    List<Movie> findAllByCategoryIdCategory(int idCategory);
    Page<Movie> findAllByCategoryIdCategory(Pageable pageable,int idCategory);
    Page<Movie> findAllByNameContaining(Pageable pageable,String nameFind);
}
