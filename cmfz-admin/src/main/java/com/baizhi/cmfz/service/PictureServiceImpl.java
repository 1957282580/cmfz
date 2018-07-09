package com.baizhi.cmfz.service;

import com.baizhi.cmfz.dao.PictureDao;
import com.baizhi.cmfz.entity.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PictureServiceImpl implements  PictureService {

    @Autowired
    private PictureDao pictureDao;

    @Override
    @Transactional
    public Map<String , Object> findAll(Integer begin, Integer pagesize) {

        List<Picture> list = pictureDao.selectAll((begin -1) * pagesize +1,pagesize);

        int count = pictureDao.count();

        Map<String , Object> map = new HashMap<String , Object>();

        map.put("total",count);
        map.put("rows",list);
        return map;

    }

    @Override
    @Transactional
    public int insert(Picture picture) {
       int result = pictureDao.add(picture);
        return result;
    }

    @Override
    @Transactional
    public int update(Picture picture) {
        int result = pictureDao.update(picture);

        return result;
    }
}
