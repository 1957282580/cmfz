package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictureDao {

    public List<Picture> selectAll(@Param("begin")Integer begin,@Param("pagesize")Integer pagesize);

    public int count();

    public int add(Picture picture);

    public int update(Picture picture);


}
