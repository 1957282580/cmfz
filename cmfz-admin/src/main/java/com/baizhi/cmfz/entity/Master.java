package com.baizhi.cmfz.entity;

import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.List;

public class Master implements Serializable {

    @Excel(name="法名")
    private String master_name;//姓名
    @Excel(name="编号")
    private String master_id;//id
    @Excel(name="头像")
    private String master_photo;//上师照片
    @Excel(name="描述信息")
    private String introduce;//简介



    public Master() {
    }

    public Master(String master_name, String master_id, String master_photo, String introduce) {
        this.master_name = master_name;
        this.master_id = master_id;
        this.master_photo = master_photo;
        this.introduce = introduce;
    }



    public Master(String master_name, String master_id, String master_photo, String introduce, List<Master> listmaster) {
        this.master_name = master_name;
        this.master_id = master_id;
        this.master_photo = master_photo;
        this.introduce = introduce;

    }

    @Override
    public String toString() {
        return "Master{" +
                "master_name='" + master_name + '\'' +
                ", master_id='" + master_id + '\'' +
                ", master_photo='" + master_photo + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }

    public Master(String master_name, String master_id, String introduce) {
        this.master_name = master_name;
        this.master_id = master_id;
        this.introduce = introduce;
    }

    public String getMaster_name() {
        return master_name;
    }

    public void setMaster_name(String master_name) {
        this.master_name = master_name;
    }

    public String getMaster_id() {
        return master_id;
    }

    public void setMaster_id(String master_id) {
        this.master_id = master_id;
    }

    public String getMaster_photo() {
        return master_photo;
    }

    public void setMaster_photo(String master_photo) {
        this.master_photo = master_photo;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }


}