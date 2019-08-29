package com.yuanian.controller;

import com.yuanian.bean.User_Role;
import com.yuanian.mapper.User_RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/user_role")
public class User_RoleController {
    @Autowired
    User_RoleMapper user_roleMapper;

    @GetMapping("/find")
    public List<User_Role> find(){
        return user_roleMapper.findUser_Role();
    }

    @PostMapping("/add")
    public List<User_Role> add(@RequestBody User_Role user_role){
        user_roleMapper.insert(user_role);
        return user_roleMapper.findUser_Role();
    }

    @GetMapping("/delete/{id}")
    public List<User_Role> del(@PathVariable("id") Integer id){
        user_roleMapper.delete(id);
        return user_roleMapper.findUser_Role();
    }

    @PostMapping("/update")
    public List<User_Role> update(@RequestBody User_Role user_role){
        System.out.println(user_role);
        user_roleMapper.update(user_role);
        return user_roleMapper.findUser_Role();
    }
}
