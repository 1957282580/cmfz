package com.baizhi.cmfz.service;

import com.baizhi.cmfz.dao.MasterDao;


import com.baizhi.cmfz.entity.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class MasterServiceImpl implements MasterService {


    @Autowired
    private MasterDao masterDao;

    @Override
    @Transactional
    public Map<String, Object> findAll(Integer begin, Integer pageSize) {

       List<Master> list = masterDao.selectAll((begin -1) * pageSize,pageSize);
       int count = masterDao.count();

       Map<String , Object> map1 = new HashMap<String , Object>();
       map1.put("total",count);
       map1.put("rows",list);
        return map1;
    }

    @Override
    @Transactional
    public int insert(Master master) {
        int result = masterDao.add(master);
        return result;
    }

    @Override
    @Transactional
    public int update(Master master) {
        int result = masterDao.update(master);
        return result;
    }

    @Override
    @Transactional
    public Map<String, Object> findlike1(String master_name,Integer begin, Integer pageSize) {
        List<Master> list = masterDao.findLikeone(master_name,(begin -1) * pageSize,pageSize);
        System.out.println(list+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        int count = masterDao.count1(master_name,(begin -1) * pageSize,pageSize);

        Map<String , Object> map2 = new HashMap<String , Object>();
        map2.put("total",count);
        map2.put("rows",list);

        return map2;
    }

    @Override
    public Map<String, Object> findlike2(String introduce,Integer begin, Integer pageSize) {
        String val = "%"+introduce+"%";
        List<Master> list = masterDao.findLiketwo(val,(begin -1) * pageSize,pageSize);

        int count = masterDao.count2(val,(begin -1) * pageSize,pageSize);

        Map<String , Object> map3 = new HashMap<String , Object>();
        map3.put("total",count);
        map3.put("rows",list);

        return map3;
    }

    @Override
    public void addGurus(List<Master> gurus) {


        masterDao.insertBatch(gurus);

    }
}
