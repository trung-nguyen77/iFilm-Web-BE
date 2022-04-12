package com.example.iFilmWeb.service;

import com.example.iFilmWeb.model.Role;
import com.example.iFilmWeb.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
