package com.yuanian.controller;

import com.yuanian.mapper.UserMapper;
import com.yuanian.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/findUser")
    public List<User> findUser(){
        return userMapper.findUser();
    }

    @PostMapping("/addUser")
    public List<User> add(@RequestBody User user){
        userMapper.insert(user);
        return userMapper.findUser();
    }

    @GetMapping("/deleteUser/{userid}")
    public List<User> del(@PathVariable("userid") Integer userid){
        userMapper.delete(userid);
        return userMapper.findUser();
    }

    @PostMapping("/updateUser")
    public List<User> update(@RequestBody User user){
        userMapper.updateUser(user);
        return userMapper.findUser();
    }
}
