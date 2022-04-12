package com.example.iFilmWeb.service;

import com.example.iFilmWeb.model.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> findAll();
    public Category findById(int id);
}
