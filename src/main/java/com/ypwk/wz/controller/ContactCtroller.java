package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Contact;

import com.ypwk.wz.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootConfiguration
@RequestMapping("/contact")

public class ContactCtroller {

    @Autowired
    public ContactService contactService;

    //查询
    @GetMapping("/select")
    public JdonResult select() {
        return contactService.select();
    }

    //删除
    @DeleteMapping("/delete/{id}")
    public JdonResult deleteById(@PathVariable("id") int id) {
        return contactService.deleteById(id);
    }

    //添加
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody Contact contact) {
        return contactService.insert(contact);
    }

    //修改
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody Contact contact) {
        return contactService.updateById(contact);
    }


}
