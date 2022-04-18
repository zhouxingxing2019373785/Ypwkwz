package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.News;

public interface NewsService {
    JdonResult select();//查询

    JdonResult deleteById (int id);//删除

    JdonResult insert (News news);//添加

    JdonResult updateById (News news);//修改
}
