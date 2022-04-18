package com.ypwk.wz.service.impl;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.dao.TeamDao;
import com.ypwk.wz.entity.Team;
import com.ypwk.wz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    public TeamDao teamDao;

    @Override
    public JdonResult select() {
        JdonResult objectJdonResultult = new JdonResult();
        List<Team> select = teamDao.select();
        if (select == null) {
            objectJdonResultult.setData(JdonResult.ERROR);
            objectJdonResultult.setCode(500);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;
        } else {
            objectJdonResultult.setState(JdonResult.SUCCESS);
            objectJdonResultult.setCode(200);
            objectJdonResultult.setMessage("操作成功");
            objectJdonResultult.setData(select);
            return objectJdonResultult;
        }
    }

    //
//通过id删除新闻内容
    @Override
    public JdonResult deleteById(int id) {
        JdonResult objectJdonResultult = new JdonResult();
        Integer integer = teamDao.deleteById(id);
        if (integer.equals(1)) {
            objectJdonResultult.setState(JdonResult.SUCCESS);
            objectJdonResultult.setCode(200);
            objectJdonResultult.setMessage("操作成功");
            return objectJdonResultult;
        } else {
            objectJdonResultult.setState(JdonResult.ERROR);
            objectJdonResultult.setCode(500);
            objectJdonResultult.setMessage("操作失败");
            return objectJdonResultult;
        }
    }

    //
    @Override
    public JdonResult insert(Team team) {
        JdonResult objectJdonResult = new JdonResult();
        Integer insert = teamDao.insert(team);
        if (insert != null) {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setCode(200);

            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        } else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;
        }
    }

    //
    @Override
    public JdonResult updateById(Team team) {

        Integer integer = teamDao.updateById(team);
        JdonResult objectJdonResult = new JdonResult();
        if (integer != null) {
            objectJdonResult.setState(JdonResult.SUCCESS);
            objectJdonResult.setCode(200);
            objectJdonResult.setMessage("操作成功");
            return objectJdonResult;
        } else {
            objectJdonResult.setState(JdonResult.ERROR);
            objectJdonResult.setCode(500);
            objectJdonResult.setMessage("操作失败");
            return objectJdonResult;
        }
    }
}
