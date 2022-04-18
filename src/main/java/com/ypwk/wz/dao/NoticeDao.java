package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Notice;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoticeDao {
    //查询新闻信息
    @Select("select * from notice order by id desc limit 6")
    List<Notice> select();

    //通过id删除新闻信息
    @Delete("delete from notice where id=#{id}")
    Integer deleteById(@Param("id") int id);

    //添加新闻信息
    @Insert({"insert into notice (name,text,time)values(#{notice.name},#{notice.text},#{notice.time})"})
    Integer insert(@Param("notice") Notice notice);

    //通过id修改新闻信息
    @Update({"update notice set name=#{notice.name},text=#{notice.text},time=#{notice.time} where id=#{notice.id}"})
    Integer updateById(@Param("notice") Notice notice);

}
