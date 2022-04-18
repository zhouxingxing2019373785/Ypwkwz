package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;

import com.ypwk.wz.entity.Notice;
import com.ypwk.wz.service.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;


@RestController
@SpringBootConfiguration
@RequestMapping("/api/notice")
public class NoticeCtroller {
    @Autowired
    public NoticeService noticeService;

    //查询
    @GetMapping("/select")
    public JdonResult select() {
        return noticeService.select();
    }

    //删除
    @DeleteMapping("/delete/{id}")
    public JdonResult deleteById(@PathVariable("id") int id) {

        return noticeService.deleteById(id);
    }

    //添加
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody Notice notice) {
        return noticeService.insert(notice);
    }

    //修改
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody Notice notice) {

        return noticeService.updateById(notice);
    }

}
