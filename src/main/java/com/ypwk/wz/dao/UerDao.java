package com.ypwk.wz.dao;

import com.ypwk.wz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UerDao {
    @Select("select * from user where username=#{user.username} and password=#{user.password}")
    Integer login(@Param("user") User user);

}
