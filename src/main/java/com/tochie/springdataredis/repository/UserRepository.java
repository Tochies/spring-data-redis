package com.tochie.springdataredis.repository;

import com.tochie.springdataredis.model.User;

import java.util.Map;

public interface UserRepository {

    void save(User user);
    Map findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);
}
