package com.example.iFilmWeb.service.impl;

import com.example.iFilmWeb.model.Role;
import com.example.iFilmWeb.model.RoleName;
import com.example.iFilmWeb.repository.IRoleRepository;
import com.example.iFilmWeb.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
