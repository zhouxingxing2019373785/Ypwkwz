package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Team;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeamDao {

    //查询招聘信息
    @Select("select * from team ")
    List<Team> select();

    //通过id删除招聘信息
    @Delete("delete from team where id=#{id}")
    Integer deleteById(@Param("id") int id);

    //添加招聘信息
    @Insert({"insert into team (name,job,picture)values(#{team.name},#{team.job},#{team.picture})"})
    Integer insert(@Param(("team")) Team team);

    //通过id修改招聘信息
    @Update({"update team set name=#{team.name},job=#{team.job},picture=#{team.picture} where id=#{team.id}"})
    Integer updateById(@Param("team") Team team);

}
