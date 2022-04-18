package com.ypwk.wz.service;


import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.User;

public interface UserService {
    JdonResult login(User user);
}
