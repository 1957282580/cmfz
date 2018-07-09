package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Picture;

import java.util.List;
import java.util.Map;

public interface PictureService {

    public Map<String,Object> findAll(Integer begin , Integer pagesize);

    public int insert(Picture picture);

    public int update(Picture picture);

}
