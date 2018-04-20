package com.alibaba.dt.service;

import com.alibaba.dt.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public void insertUser(com.alibaba.dt.entity.User user) {
        userDAO.insertUser(user);
    }

    @Override
    public List<com.alibaba.dt.entity.User> queryAll() {
        return userDAO.queryAll();
    }
}
