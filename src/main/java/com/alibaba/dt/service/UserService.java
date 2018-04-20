package com.alibaba.dt.service;

import com.alibaba.dt.entity.User;

import java.util.List;

public interface UserService {
    public void insertUser(User user);

    public List<User> queryAll();
}
