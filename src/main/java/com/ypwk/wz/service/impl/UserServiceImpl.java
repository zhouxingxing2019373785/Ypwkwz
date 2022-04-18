package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.UerDao;
import com.ypwk.wz.entity.User;
import com.ypwk.wz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UerDao uerDao;

    @Override
    public JdonResult login(User user) {
        Integer login = uerDao.login(user);
        JdonResult objectJdonResult = new JdonResult();
        if (login == null) {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("登录失败");
            return objectJdonResult;
        } else {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("登录成功");
            return objectJdonResult;
        }
    }
}
