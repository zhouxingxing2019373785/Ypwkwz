package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Contact;
import com.ypwk.wz.entity.News;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ContactDao {
    //查询新闻信息
    @Select("select * from contact ")
    List<Contact> select();

    //通过id删除新闻信息
    @Delete("delete from contact where id=#{id}")
    Integer deleteById(@Param("id") int id);

    //添加新闻信息
    @Insert({"insert into contact (adphone,cusphone,address,website,wechat,code)values(#{contact.adphone},#{contact.cusphone},#{contact.address},#{contact.website},#{contact.wechat},#{contact.code})"})
    Integer insert(@Param(("contact")) Contact contact);

    //通过id修改新闻信息
    @Update({"update contact set adphone=#{contact.adphone},cusphone=#{contact.cusphone},address=#{contact.address}, website=#{contact.website},wechat=#{contact.wechat},code=#{contact.code} where id=#{contact.id}"})
    Integer updateById(@Param("contact") Contact contact);



}
