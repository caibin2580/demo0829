package com.yuanian.bean;

import lombok.Data;

@Data
public class User {
    private Integer userid;
    private String username;
    private String password;

//    public static void main(String[] args) {
//        User user = new User();
//        user.setUsername("caibin0816");
//        user.setPassword("123abc");
//        System.out.println(user.toString());
//    }
}
