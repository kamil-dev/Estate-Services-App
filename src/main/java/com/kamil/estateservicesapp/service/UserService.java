package com.kamil.estateservicesapp.service;

import com.kamil.estateservicesapp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
