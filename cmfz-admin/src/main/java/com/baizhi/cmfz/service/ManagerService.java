package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.entity.User;

public interface ManagerService {
    //登录查询
    public Manager findmanager(String user_name, String user_password);

}
