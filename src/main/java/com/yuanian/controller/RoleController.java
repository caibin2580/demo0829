package com.yuanian.controller;

import com.yuanian.bean.Role;
import com.yuanian.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/role")
public class RoleController {
    @Autowired
    RoleMapper roleMapper;

    @GetMapping("/findRole")
    public List<Role> findRole(){
        return roleMapper.findRole();
    }

    @PostMapping("/addRole")
    public List<Role> add(@RequestBody Role role){
        roleMapper.insert(role);
        return roleMapper.findRole();
    }

    @GetMapping("/deleteRole/{roleid}")
    public List<Role> del(@PathVariable("roleid") Integer id){
        roleMapper.delete(id);
        return roleMapper.findRole();
    }

    @PostMapping("/updateRole")
    public List<Role> update(@RequestBody Role role){
        roleMapper.updateRole(role);
        return roleMapper.findRole();
    }
}
