package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;

import com.ypwk.wz.entity.Team;

public interface TeamService {

    JdonResult select();//查询

    JdonResult deleteById(int id);//删除

    JdonResult insert(Team team);//添加

    JdonResult updateById(Team team);//修改


}
