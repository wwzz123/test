package com.map.service.impl;

import com.map.mapper.UserMapper;
import com.map.model.User;
import com.map.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        userMapper.save(username,password);
        //int i = 10/0;
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
