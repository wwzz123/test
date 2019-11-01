package com.map.service;

import com.map.model.User;

public interface IUserService {

    public void register(String username,String password);
    public User findByUsername(String username);
}
