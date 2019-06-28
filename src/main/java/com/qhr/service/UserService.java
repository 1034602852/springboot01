package com.qhr.service;

import com.qhr.entity.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUser(User user);
    int updateUser(User user);
    User findUser(User user);
    List<User> selectUsers();
}
