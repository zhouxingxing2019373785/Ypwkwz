package com.ypwk.wz.common;

import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.Setter;

//自定义异常配置类
@Setter
@Generated
@NoArgsConstructor
public class Exceptioncommon  extends RuntimeException {
    private static final long serialVersionUID = 8641717992917473974L;
    private int errorCode;

    private String errorMag;
    public Exceptioncommon(int errorCode, String errorMag) {
        super(errorMag);
        this.errorCode = errorCode;
        this.errorMag = errorMag;
    }


}
