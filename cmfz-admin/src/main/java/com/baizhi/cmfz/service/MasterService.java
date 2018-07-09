package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Master;

import java.util.List;
import java.util.Map;

public interface MasterService {

    public Map<String , Object> findAll(Integer begin,Integer pageSize);


    public int insert(Master master);

    public int update(Master master);

    public Map<String , Object> findlike1(String master_name,Integer begin,Integer pageSize);

    public Map<String , Object> findlike2(String introduce,Integer begin,Integer pageSize);

    public void addGurus(List<Master> gurus);


}
