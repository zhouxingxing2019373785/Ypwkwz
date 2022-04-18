package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.SysAlentity;

public interface ALservice {
    //查询案例
    JdonResult<SysAlentity> SelectAlservice();
    //新增案例
    JdonResult<SysAlentity> InsertAlServie(SysAlentity sysAlentity);
    //修改案例
    JdonResult<SysAlentity>updateAlService(SysAlentity sysAlentity);
}
