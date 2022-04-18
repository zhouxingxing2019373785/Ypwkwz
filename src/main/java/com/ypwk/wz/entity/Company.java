package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private int id;//id
    private String gsm;//公司名
    private String gsjs;//公司介绍
    private String tp;//图片
}
