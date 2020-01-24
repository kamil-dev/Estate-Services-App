package com.kamil.estateservicesapp.repository;

import com.kamil.estateservicesapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
