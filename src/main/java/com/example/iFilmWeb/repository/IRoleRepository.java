package com.example.iFilmWeb.repository;

import com.example.iFilmWeb.model.Role;
import com.example.iFilmWeb.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
