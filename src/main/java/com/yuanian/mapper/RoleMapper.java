package com.yuanian.mapper;

import com.yuanian.bean.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleMapper {
    @Select("select * from role")
    List<Role> findRole();

    @Insert("insert into role (rolename) values (#{rolename})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "roleid",
            before = false, resultType = Integer.class)
    void insert(Role role);

    @Delete("delete from role where roleid = #{id}")
    void delete(Integer id);

    @Update("update role set rolename = #{rolename} where roleid = #{roleid}")
    void updateRole(Role role);
}
