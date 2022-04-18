package com.ypwk.wz.service;
import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Recruit;

public interface RecruitService {
    JdonResult select();//查询

    JdonResult deleteById(int id);//删除

    JdonResult insert(Recruit recruit);//添加

    JdonResult updateById(Recruit recruit);//修改
}
