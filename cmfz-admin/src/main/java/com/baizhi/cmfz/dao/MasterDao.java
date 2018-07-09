package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Master;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MasterDao {


    public List<Master> selectAll(@Param("begin")Integer begin, @Param("pagesize")Integer pagesize);

    public  int count();

    public int add(Master master);

    public int update(Master master);

    public void insertBatch(@Param("list") List<Master> list);


    public List<Master> findLikeone(@Param("master_name") String master_name,@Param("begin")Integer begin, @Param("pagesize")Integer pagesize);
    public int count1(@Param("master_name") String master_name,@Param("begin")Integer begin, @Param("pagesize")Integer pagesize);

    public List<Master> findLiketwo(@Param("introduce")String introduce,@Param("begin")Integer begin, @Param("pagesize")Integer pagesize);
    public int count2(@Param("introduce")String introduce,@Param("begin")Integer begin, @Param("pagesize")Integer pagesize);


}
