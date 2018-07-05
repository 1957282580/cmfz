package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.entity.User;
import org.apache.ibatis.annotations.Param;

public interface ManagerDao {

    public Manager selectmanager(@Param("mgr_name")String mgr_name);

}
