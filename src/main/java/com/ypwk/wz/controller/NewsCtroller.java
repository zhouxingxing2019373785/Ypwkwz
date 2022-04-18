package com.ypwk.wz.controller;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.News;
import com.ypwk.wz.service.NewsService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootConfiguration
@RestController
@RequestMapping("/news")
public class NewsCtroller {
    @Autowired
    public NewsService newsService;
//查询
    @GetMapping("/select")
    public JdonResult select() {
        return newsService.select();
    }
//删除
    @DeleteMapping("/delete/{id}")
    public JdonResult deleteById(@PathVariable("id") int id) {
        return newsService.deleteById(id);
    }
//添加
    @PostMapping("/insert")
    public JdonResult insert(@RequestBody News news) {
        return newsService.insert(news);
    }
//修改
    @PutMapping("/update")
    public JdonResult updateById(@RequestBody News news) {
        return newsService.updateById(news);
    }

}
