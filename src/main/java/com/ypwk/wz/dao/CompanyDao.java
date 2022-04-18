package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Company;
import com.ypwk.wz.entity.Recruit;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface CompanyDao {
    //通过id查询公司信息
    @Select("select * from gsjs where gsm like CONCAT('%',#{name},'%')")
    List<Company> selectByName(@Param("name") String name);

    //通过id删除公司信息
    @Delete("delete from gsjs where id=#{id}")
    Integer deleteById(@Param("id") int id);

    //添加公司信息
    @Insert({"insert into gsjs (gsm,gsjs,tp) values (#{company.gsm},#{company.gsjs},#{company.tp})"})
    Integer insert(@Param("company") Company company);

    //通过id修改公司信息
    @Update({"update gsjs set gsm=#{company.gsm},gsjs=#{company.gsjs},tp=#{company.tp} where id=#{company.id}"})
    Integer updateById(@Param("company") Company company);

}
