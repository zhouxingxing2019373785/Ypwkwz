package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.NewsDao;
import com.ypwk.wz.entity.News;
import com.ypwk.wz.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    public NewsDao newsDao;
//判断查询新闻内容是否成功
    @Override
    public JdonResult select() {

        JdonResult objectJdonResultult = new JdonResult();
        List<News> news = newsDao.select();
        if (news == null) {
            objectJdonResultult.setState(JdonResult.ERROR);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;
        } else {
            objectJdonResultult.setState(JdonResult.SUCCESS);
            objectJdonResultult.setMessage("操作成功");
            objectJdonResultult.setData(news);
            return objectJdonResultult;
        }

    }
//通过id删除新闻内容
    @Override
    public JdonResult deleteById(int id) {

        JdonResult objectJdonResultult = new JdonResult();

        Integer integer = newsDao.deleteById(id);

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

//添加新闻内容
    @Override
    public JdonResult insert(News news) {

        JdonResult objectJdonResult = new JdonResult();

        Integer insert = newsDao.insert(news);
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
//修改新闻内容
    @Override
    public JdonResult updateById(News news) {

        Integer update = newsDao.updateById(news);

        JdonResult objectJdonResult = new JdonResult();
        if (update != null) {
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
