package com.baizhi.cmfz.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String user_id;//用户id
    private String user_name;//用户姓名
    private String user_faname;//法名
    private String user_password;//密码
    private String user_sex;//性别
    private String user_headpic;//头像
    private String user_address;//地址
    private String user_phone;//电话
    private String user_sign;//签名
    private String user_status;//状态
    private String masterld;//跟随上师

    public User() {
    }

    public User(String user_id, String user_name, String user_faname, String user_password, String user_sex, String user_headpic, String user_address, String user_phone, String user_sign, String user_status, String masterld) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_faname = user_faname;
        this.user_password = user_password;
        this.user_sex = user_sex;
        this.user_headpic = user_headpic;
        this.user_address = user_address;
        this.user_phone = user_phone;
        this.user_sign = user_sign;
        this.user_status = user_status;
        this.masterld = masterld;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_faname() {
        return user_faname;
    }

    public void setUser_faname(String user_faname) {
        this.user_faname = user_faname;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_headpic() {
        return user_headpic;
    }

    public void setUser_headpic(String user_headpic) {
        this.user_headpic = user_headpic;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_sign() {
        return user_sign;
    }

    public void setUser_sign(String user_sign) {
        this.user_sign = user_sign;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getMasterld() {
        return masterld;
    }

    public void setMasterld(String masterld) {
        this.masterld = masterld;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_faname='" + user_faname + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_headpic='" + user_headpic + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_sign='" + user_sign + '\'' +
                ", user_status='" + user_status + '\'' +
                ", masterld='" + masterld + '\'' +
                '}';
    }
}
