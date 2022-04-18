package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact implements Serializable {
    private int id;//主键
    private int adphone;//行政电话
    private int cusphone;//客户电话
    private String address;//公司地址
    private String website;//公司网站
    private String wechat;//微信号
    private String code;//二维码



}
