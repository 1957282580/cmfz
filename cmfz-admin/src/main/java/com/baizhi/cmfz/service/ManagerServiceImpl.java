package com.baizhi.cmfz.service;

import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.entity.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    @Override//登录查询
    @Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
    public Manager findmanager(String mgr_name, String mgr_pwd) {

        Manager manager =  null;
        manager = managerDao.selectmanager(mgr_name);

        if(manager != null){
            //DigestUtils.sha256Hex(mgr_pwd+manager.getColumn_4())
            if (manager.getMgr_pwd().equals(mgr_pwd)){
                return manager;
            }
        }
        return null;
    }
}
