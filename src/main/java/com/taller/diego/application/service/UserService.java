package com.taller.diego.application.service;

import java.util.List;

import com.taller.diego.domain.User;

public interface UserService {
    public List<User> findAllUsersByFilter(String filter, String value);
}
