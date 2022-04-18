package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruit implements Serializable {
    private int id ;//主键
    private String zw;//职位
    private String zwxq;//职位详情
    private String gznr;//工作内容
    private String xz;//薪资
}
