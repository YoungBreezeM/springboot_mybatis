package com.datacrud.springboot_mybatis.controller;

import com.datacrud.springboot_mybatis.dao.UserDao;
import com.datacrud.springboot_mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("crud")
public class CrudController {

    @Autowired
    private UserDao userDao;
    @GetMapping
    public List<User> getUserList(){
        return userDao.findAll();
    }
}
