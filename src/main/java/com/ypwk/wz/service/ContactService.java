package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Contact;


public interface ContactService {
    JdonResult select();//查询

    JdonResult deleteById (int id);//删除

    JdonResult insert (Contact contact);//添加

    JdonResult updateById (Contact contact);//修改


}
