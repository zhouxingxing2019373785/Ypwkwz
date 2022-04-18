package com.ypwk.wz.controller;
import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.SysAlentity;
import com.ypwk.wz.service.ALservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootConfiguration
@RestController
@RequestMapping("/an")
public class AlController {
    @Autowired
    private ALservice aLservice;
    @GetMapping("/select")
    public JdonResult<SysAlentity> SelectAlController(){
        System.out.println(aLservice.SelectAlservice());
        return aLservice.SelectAlservice();
    }
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody SysAlentity sysAlentity) {
        return aLservice.InsertAlServie(sysAlentity);

    }
    //修改公司信息
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody SysAlentity sysAlentity) {

        return aLservice.updateAlService(sysAlentity);
    }
}
