package com.ypwk.wz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class News implements Serializable {
    private int id;//id
    private String title;//标题
    private String text;//文本
    private String picture;//图片

}
