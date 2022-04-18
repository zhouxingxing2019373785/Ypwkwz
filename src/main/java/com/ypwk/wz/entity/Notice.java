package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
    private int id;//主键
    private String name;//通知名
    private String text;//通知内容
    private Date time;//时间

}
