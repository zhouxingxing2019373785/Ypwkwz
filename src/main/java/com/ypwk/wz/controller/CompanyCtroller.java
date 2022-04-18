package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Company;
import com.ypwk.wz.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootConfiguration
@RestController
@RequestMapping("/company")
public class CompanyCtroller {
    @Autowired
    public CompanyService companyService;

    //查询公司信息
    @GetMapping("/select/{name}")
    public JdonResult selectByName(@PathVariable("name") String name) {
        return companyService.selectByName(name);
    }


    //删除公司信息
    @DeleteMapping("/delete/{id}")
    public JdonResult deleteById(@PathVariable("id") int id) {
        return companyService.deleteById(id);

    }

    //添加公司信息
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody Company company) {
        return companyService.insert(company);

    }

    //修改公司信息
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody Company company) {
        return companyService.updateById(company);
    }
}
