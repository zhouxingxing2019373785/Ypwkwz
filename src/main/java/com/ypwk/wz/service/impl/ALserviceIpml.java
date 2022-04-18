package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.SysAlDao;
import com.ypwk.wz.entity.SysAlentity;
import com.ypwk.wz.service.ALservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ALserviceIpml implements ALservice {
    @Autowired
    private SysAlDao sysAlDao;

    JdonResult objectJdonResult = new JdonResult();
    //查询案例
    @Override
    public JdonResult SelectAlservice() {
        List<SysAlentity> sysAlentities = sysAlDao.SelectAlDao();
        if(sysAlentities.size()==0) {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("暂无数据");
            return objectJdonResult;

        } else {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setData(sysAlentities);
            return objectJdonResult;
        }
    }
   //新增案例
    @Override
    public JdonResult<SysAlentity> InsertAlServie(SysAlentity sysAlentity) {

        Integer insert = sysAlDao.InsertAlDao(sysAlentity);
        if (insert!= 0) {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setData(insert);
            return objectJdonResult;
        } else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("操作失败");

            return objectJdonResult;

        }

    }

    @Override
    public JdonResult<SysAlentity> updateAlService(SysAlentity sysAlentity) {
        JdonResult objectJdonResult = new JdonResult();
        Integer integer = sysAlDao.updateAlDao(sysAlentity);
        if (integer != null) {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");

            return objectJdonResult;

        } else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;

        }
    }
}
