package com.aziz.universite.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aziz.universite.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}

