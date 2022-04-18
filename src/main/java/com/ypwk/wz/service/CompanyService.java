package com.ypwk.wz.service;

import com.ypwk.wz.common.JdonResult;
import com.ypwk.wz.entity.Company;
import com.ypwk.wz.entity.Recruit;

public interface CompanyService {
    JdonResult selectByName(String name);

    JdonResult deleteById(int id);

    JdonResult insert(Company company);

    JdonResult updateById(Company id);
}
