package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.ContactDao;
import com.ypwk.wz.entity.Contact;
import com.ypwk.wz.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    public ContactDao contactDao;

    @Override
    public JdonResult select() {
        List<Contact> select = contactDao.select();

        JdonResult objectJdonResultult = new JdonResult();

        if (select == null) {
            objectJdonResultult.setData(JdonResult.ERROR);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;

        } else {
            objectJdonResultult.setState(JdonResult.SUCCESS);
            objectJdonResultult.setMessage("操作成功");
            objectJdonResultult.setData(select);
            return objectJdonResultult;
        }
    }


    //删除
    public JdonResult deleteById(int id) {

        JdonResult objectJdonResultult = new JdonResult();
        Integer integer = contactDao.deleteById(id);
        if (integer.equals(1)) {
            objectJdonResultult.setState(JdonResult.SUCCESS);
            objectJdonResultult.setMessage("操作成功");
            return objectJdonResultult;

        } else {

            objectJdonResultult.setState(JdonResult.ERROR);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;
        }
    }

    //添加
    @Override
    public JdonResult insert(Contact contact) {

        JdonResult objectJdonResult = new JdonResult();
        Integer insert = contactDao.insert(contact);
        if (insert != null) {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        } else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;
        }
    }
    //更新
    @Override
    public JdonResult updateById(Contact contact) {

        Integer integer = contactDao.updateById(contact);

        JdonResult objectJdonResult = new JdonResult();
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
