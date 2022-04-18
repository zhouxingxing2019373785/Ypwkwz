package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Notice;

public interface NoticeService {
    JdonResult select();//查询

    JdonResult deleteById (int id);//删除

    JdonResult insert (Notice notice);//添加

    JdonResult updateById (Notice notice);//修改


}
