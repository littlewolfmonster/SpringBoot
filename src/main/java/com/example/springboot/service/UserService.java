package com.example.springboot.service;

import com.example.springboot.pojo.User;

public interface UserService {
    User selectUserById(Integer id);
}
