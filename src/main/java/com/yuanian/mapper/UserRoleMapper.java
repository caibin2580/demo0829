package com.yuanian.mapper;

import com.yuanian.bean.UserRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserRoleMapper {
    @Select("select `user`.userid,`user`.username,`user`.`password`,\n" +
            "role.roleid,role.rolename,user_role.id\n" +
            "from user join user_role \n" +
            "on `user`.userid = user_role.userid\n" +
            "join role on role.roleid = user_role.roleid;")
    List<UserRole> findUserRole();
}
