package com.example.iFilmWeb.service.impl;

import com.example.iFilmWeb.model.Category;
import com.example.iFilmWeb.repository.CategoryRepo;
import com.example.iFilmWeb.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepo.findById(id).get();
    }

}
