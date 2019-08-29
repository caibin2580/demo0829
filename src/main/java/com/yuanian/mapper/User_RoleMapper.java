package com.yuanian.mapper;

import com.yuanian.bean.User_Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface User_RoleMapper {
    @Select("select * from user_role")
    List<User_Role> findUser_Role();

    @Insert("insert into user_role (userid, roleid) values (#{userid}, #{roleid})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(User_Role user_role);

    @Delete("delete from user_role where id = #{id}")
    void delete(Integer id);

    @Update("update user_role set userid = #{userid}, roleid = #{roleid} where id = #{id}")
    void update(User_Role user_role);
}
