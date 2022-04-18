package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.RecruitDao;
import com.ypwk.wz.entity.Recruit;
import com.ypwk.wz.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruitSeviceImpl implements RecruitService {
    @Autowired
    public RecruitDao recruitDao;

//判断查询招聘信息是否成功
    @Override
    public JdonResult select() {
        JdonResult objectJdonResult = new JdonResult();
        Recruit recruit = recruitDao.select();
        if (recruit == null) {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;

        } else {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");
            objectJdonResult.setData(recruit);
            return objectJdonResult;
        }
    }
    //判断是否删除成功
    @Override
    public JdonResult deleteById(int id){
        JdonResult objectJdonResult = new JdonResult();
        Integer count = recruitDao.deleteById(id);
       if(count.equals(1)) {
           objectJdonResult.setState(JdonResult.SUCCESS);
           objectJdonResult.setMessage("操作成功");
           return objectJdonResult;

       }else {
           objectJdonResult.setState(JdonResult.ERROR);
           objectJdonResult.setMessage("操作失败");
           return objectJdonResult;
       }
    }
    //判断是否插入成功
    @Override
    public JdonResult insert (Recruit recruit){
        JdonResult objectJdonResult = new JdonResult();
        Integer insert = recruitDao.insert(recruit);
        if (insert!=null){
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        }else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult ;
        }
    }
    //判断是否修改招聘信息成功
    @Override
    public JdonResult updateById (Recruit recruit){
        Integer update = recruitDao.updateById(recruit);
        JdonResult objectJdonResult = new JdonResult();
        if (update!=null){
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        }else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;
        }
    }
}
