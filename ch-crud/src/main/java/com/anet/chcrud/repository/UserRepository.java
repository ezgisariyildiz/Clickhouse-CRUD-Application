package com.anet.chcrud.repository;

import com.anet.chcrud.model.User;

import java.util.List;

public interface UserRepository {

    User save(User user);

    User getById(Long id);

    List<User> getByName(String name);

    void deleteById(Long id);

}
