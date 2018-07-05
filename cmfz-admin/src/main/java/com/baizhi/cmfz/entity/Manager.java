package com.baizhi.cmfz.entity;

import java.io.Serializable;

public class Manager implements Serializable {


    private  String mgr_id;//管理员编号id
    private  String mgr_name;//管理员姓名
    private  String mgr_pwd;//加密密码
    private  String column_4;//随机盐
    private  String column_5;//状态


    public Manager() {
    }

    public Manager(String mgr_id, String mgr_name, String mgr_pwd, String column_4, String column_5) {
        this.mgr_id = mgr_id;
        this.mgr_name = mgr_name;
        this.mgr_pwd = mgr_pwd;
        this.column_4 = column_4;
        this.column_5 = column_5;
    }

    public String getMgr_id() {
        return mgr_id;
    }

    public void setMgr_id(String mgr_id) {
        this.mgr_id = mgr_id;
    }

    public String getMgr_name() {
        return mgr_name;
    }

    public void setMgr_name(String mgr_name) {
        this.mgr_name = mgr_name;
    }

    public String getMgr_pwd() {
        return mgr_pwd;
    }

    public void setMgr_pwd(String mgr_pwd) {
        this.mgr_pwd = mgr_pwd;
    }

    public String getColumn_4() {
        return column_4;
    }

    public void setColumn_4(String column_4) {
        this.column_4 = column_4;
    }

    public String getColumn_5() {
        return column_5;
    }

    public void setColumn_5(String column_5) {
        this.column_5 = column_5;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgr_id='" + mgr_id + '\'' +
                ", mgr_name='" + mgr_name + '\'' +
                ", mgr_pwd='" + mgr_pwd + '\'' +
                ", column_4='" + column_4 + '\'' +
                ", column_5='" + column_5 + '\'' +
                '}';
    }




}
