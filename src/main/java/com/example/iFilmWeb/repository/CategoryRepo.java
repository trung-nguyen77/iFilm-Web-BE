package com.example.iFilmWeb.repository;

import com.example.iFilmWeb.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CategoryRepo extends PagingAndSortingRepository<Category, Integer> {
}
