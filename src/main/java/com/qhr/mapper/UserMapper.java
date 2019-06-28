package com.qhr.mapper;

import com.qhr.entity.User;

import java.util.List;
//@Mapper
public interface UserMapper {
    int addUser(User user);
    int deleteUser(User user);
    int updateUser(User user);
    User findUser(User user);
    List<User> selectUsers();
}
