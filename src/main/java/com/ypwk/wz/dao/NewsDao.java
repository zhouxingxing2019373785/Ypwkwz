package com.ypwk.wz.dao;

import com.ypwk.wz.entity.News;
import com.ypwk.wz.entity.Recruit;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewsDao {
    //查询新闻信息
    @Select("select * from news ")
    List<News> select();

    //通过id删除新闻信息
    @Delete("delete from news where id=#{id}")
    Integer deleteById(@Param("id") int id);

    //添加新闻信息
    @Insert({"insert into news (title,text,picture)values(#{news.title},#{news.text},#{news.picture})"})
    Integer insert(@Param(("news")) News news);

    //通过id修改新闻信息
    @Update({"update news set title=#{news.title},text=#{news.text},picture=#{news.picture} where id=#{news.id}"})
    Integer updateById(@Param("news") News news);

}
