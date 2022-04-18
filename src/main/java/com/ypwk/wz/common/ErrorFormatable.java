package com.ypwk.wz.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
//定义抛出异常工具类
@Setter
@Getter
@NoArgsConstructor
public class ErrorFormatable {
    private int errorCode;

    private String errorMsg;

    public ErrorFormatable(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Exceptioncommon baseException(String errorMsg) {
        return new Exceptioncommon(this.errorCode, String.format(this.errorMsg, errorMsg));
    }

    public void isEmptyThrow(Object o, String msg) {
        if (o == null) {
            throw baseException(msg);
        }
    }

    public void isNotEmptyThrow(Object o, String msg) {
        if (o != null) {
            throw baseException(msg);
        }
    }

    public void isEmptyThrow(Long o, String msg) {
        if (o == null || o == 0L) {
            throw baseException(msg);
        }
    }

    public void isNotEmptyThrow(Long o, String msg) {
        if (o != null && o != 0L) {
            throw baseException(msg);
        }
    }

    public void isNotEmptyThrow(Collection collection, String msg) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw baseException(msg);
        }
    }

    public void isEmptyThrow(Collection collection, String msg) {
        if (CollectionUtils.isEmpty(collection)) {
            throw baseException(msg);
        }
    }

    public void isEmptyThrow(Integer o, String msg) {
        if (o == null || o == 0) {
            throw baseException(msg);
        }
    }

    public void isNotEmptyThrow(Integer o, String msg) {
        if (o != null && o != 0) {
            throw baseException(msg);
        }
    }

    public void isEmptyThrow(String o, String msg) {
        if (StringUtils.isBlank(o)) {
            throw baseException(msg);
        }
    }

    public void isNotEmptyThrow(String o, String msg) {
        if (StringUtils.isNotBlank(o)) {
            throw baseException(msg);
        }
    }

    public void assemble(Boolean throwable, String msg) {
        if (throwable) {
            throw baseException(msg);
        }
    }

    public static final int SUCCESS_CODE = 1000;
    public static final String SUCCESS_MSG = "操作成功";
    public static final ErrorFormatable NOT_EMPTY = new ErrorFormatable(1001, "%s不能为空");
    public static final ErrorFormatable NEED_EMPTY = new ErrorFormatable(1002, "%s必须为空");
    public static final ErrorFormatable NOT_EXIST = new ErrorFormatable(1010, "%s不存在");
    public static final ErrorFormatable EXIST = new ErrorFormatable(1004, "%s已经存在");
    public static final ErrorFormatable CUSTOM = new ErrorFormatable(1005, "%s");
    public static final ErrorFormatable INTERNAL_ERROR = new ErrorFormatable(1009, "%s");
    public static final int VALIDATE_FAIL_CODE = 1007;
    public static final int INTERVAL_FAIL_CODE = 1006;
    public static final int AUTHORIZATION_FAIL_CODE = 1008;
    public static final int AUTHENTICATION_FAIL_CODE = 1009;

}
