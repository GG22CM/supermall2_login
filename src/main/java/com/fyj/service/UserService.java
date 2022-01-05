package com.fyj.service;

import com.fyj.domain.User;

public interface UserService {
    User getUser(String username, String password);
}
