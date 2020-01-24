package com.kamil.estateservicesapp.service;

public interface SecurityService {
    void autoLogin(String username, String password);
    String findLoggedUsername();

}
