package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SysAlentity {
    private int id;//id
    private  String alm;//案例名
    private String aljs;//案例介绍
    private  String tplj;//图片路径
}
