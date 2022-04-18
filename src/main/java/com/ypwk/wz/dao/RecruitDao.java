package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Recruit;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PutMapping;

@Mapper
public interface RecruitDao {
    //查询招聘信息
    @Select("select * from zpxx ")
    Recruit select();

    //通过id删除招聘信息
    @Delete("delete from zpxx where id=#{id}")
    Integer deleteById(@Param("id") int id);

    //添加招聘信息
    @Insert({"insert into zpxx (zw,zwxq,gznr,xz)values(#{recruit.zw},#{recruit.zwxq},#{recruit.gznr},#{recruit.xz})"})
    Integer insert(@Param(("recruit")) Recruit recruit);

    //通过id修改招聘信息
    @Update({"update zpxx set zw=#{recruit.zw},zwxq=#{recruit.zwxq},gznr=#{recruit.gznr},xz=#{recruit.xz} where id=#{recruit.id}"})
    Integer updateById(@Param("recruit") Recruit recruit);
}
