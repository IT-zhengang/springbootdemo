package com.alibaba.dt.controller;

import com.alibaba.dt.entity.User;
import com.alibaba.dt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(HttpServletRequest request){
        List<User> users = userService.queryAll();
        request.setAttribute("users",users);
        return "index";
    }
}
