package com.kamil.estateservicesapp.repository;

import com.kamil.estateservicesapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
