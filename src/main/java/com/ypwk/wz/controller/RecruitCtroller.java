package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Recruit;
import com.ypwk.wz.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootConfiguration
@RestController
@RequestMapping("/recruit")
public class RecruitCtroller {


    @Autowired
    private RecruitService recruitService;

    //通过id查询招聘信息

    @GetMapping("/select")
    public JdonResult select() {
        return recruitService.select();
    }


    //通过id删除招聘信息
    @DeleteMapping("/delete/{id}")
    public JdonResult deleteById(@PathVariable("id") int id) {

        return recruitService.deleteById(id);
    }

    //添加招聘信息
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody Recruit recruit) {

        return recruitService.insert(recruit);

    }

    //通过id修改招聘信息
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody Recruit recruit) {

        return recruitService.updateById(recruit);
    }

}
