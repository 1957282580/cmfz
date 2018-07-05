package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {

    //查询管理页面的所有信息
    public List<Menu> selectAll();


}
