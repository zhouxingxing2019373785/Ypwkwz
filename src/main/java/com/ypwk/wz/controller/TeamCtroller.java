package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.News;
import com.ypwk.wz.entity.Team;
import com.ypwk.wz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;
@RestController
@SpringBootConfiguration
@RequestMapping("/api/team")
public class TeamCtroller {
    @Autowired
    public TeamService teamService;

    //查询
    @GetMapping("/select")
    public JdonResult select() {

        return teamService.select();
    }
    //删除
    @DeleteMapping("/delete/{id}")
    public JdonResult deleteById(@PathVariable("id") int id) {
        return teamService.deleteById(id);
    }
    //添加
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody Team team) {

        return teamService.insert(team);
    }
    //修改
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody Team team) {

        return teamService.updateById(team);
    }

}
