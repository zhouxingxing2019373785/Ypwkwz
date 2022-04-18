package com.ypwk.wz.dao;

import com.ypwk.wz.entity.Company;
import com.ypwk.wz.entity.SysAlentity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface SysAlDao {
    //查寻案例
    @Select("select * from al")
    List<SysAlentity> SelectAlDao() ;
    //新增案例
    @Insert("insert into al (alm,aljs,tplj) values (#{sysAlentity.alm},#{sysAlentity.aljs},#{sysAlentity.tplj})")
    Integer InsertAlDao(@Param("sysAlentity") SysAlentity sysAlentity);
    //修改案例
    @Update({"update sysAlentity set alm=#{sysAlentity.alm},gsjs=#{sysAlentity.aljs},tp=#{sysAlentity.tplj} where id =#{sysAlentity.id}"})
    Integer updateAlDao(@Param("sysAlentity") SysAlentity sysAlentity);


}

