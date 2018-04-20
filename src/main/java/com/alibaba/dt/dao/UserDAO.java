package com.alibaba.dt.dao;

import com.alibaba.dt.entity.User;

import java.util.List;

public interface UserDAO {

    public void insertUser(User user);

    public List<User> queryAll();
}
