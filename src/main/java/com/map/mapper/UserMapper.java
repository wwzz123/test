package com.map.mapper;

import com.map.model.User;

public interface UserMapper {


    public int save(String username,String password);

    public User findByUsername(String username);
}
