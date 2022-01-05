package com.fyj.service.impl;

import com.fyj.domain.User;
import com.fyj.mapper.UserMapper;
import com.fyj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(String username, String password) {
        return userMapper.selectUser(username, password);
    }
}
