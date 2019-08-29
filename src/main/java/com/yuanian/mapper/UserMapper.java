package com.yuanian.mapper;

import com.yuanian.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findUser();

    @Insert("insert into user (username, password) values (#{username}, #{password})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "userid",
            before = false, resultType = Integer.class)
    void insert(User user);

    @Delete("delete from user where userid = #{id}")
    void delete(Integer id);

    @Update("update user set username = #{username}, password = #{password} where userid = #{userid}")
    void updateUser(User user);
}
