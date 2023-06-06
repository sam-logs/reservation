package com.spring.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jwt.models.ERole;
import com.spring.jwt.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
