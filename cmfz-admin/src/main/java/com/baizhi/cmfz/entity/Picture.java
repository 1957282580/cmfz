package com.baizhi.cmfz.entity;

import java.io.Serializable;

public class Picture implements Serializable {

    private  String picture_id;
    private  String picture_path;//轮播图路径
    private  String picture_date;//图片上传时间
    private  String picture_descripti;//描述
    private  String picture_status;//展示状态


    public Picture(String picture_id, String picture_path, String picture_date, String picture_descripti, String picture_status) {
        this.picture_id = picture_id;
        this.picture_path = picture_path;
        this.picture_date = picture_date;
        this.picture_descripti = picture_descripti;
        this.picture_status = picture_status;
    }

    public Picture(String picture_id, String picture_path, String picture_descripti, String picture_status) {
        this.picture_id = picture_id;
        this.picture_path = picture_path;
        this.picture_descripti = picture_descripti;
        this.picture_status = picture_status;
    }

    public Picture(String picture_path, String picture_descripti, String picture_status) {
        this.picture_path = picture_path;
        this.picture_descripti = picture_descripti;
        this.picture_status = picture_status;
    }

    public Picture() {

    }

    @Override
    public String toString() {
        return "Picture{" +
                "picture_id='" + picture_id + '\'' +
                ", picture_path='" + picture_path + '\'' +
                ", picture_date='" + picture_date + '\'' +
                ", picture_descripti='" + picture_descripti + '\'' +
                ", picture_status='" + picture_status + '\'' +
                '}';
    }

    public String getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(String picture_id) {
        this.picture_id = picture_id;
    }

    public String getPicture_path() {
        return picture_path;
    }

    public void setPicture_path(String picture_path) {
        this.picture_path = picture_path;
    }

    public String getPicture_date() {
        return picture_date;
    }

    public void setPicture_date(String picture_date) {
        this.picture_date = picture_date;
    }

    public String getPicture_descripti() {
        return picture_descripti;
    }

    public void setPicture_descripti(String picture_descripti) {
        this.picture_descripti = picture_descripti;
    }

    public String getPicture_status() {
        return picture_status;
    }

    public void setPicture_status(String picture_status) {
        this.picture_status = picture_status;
    }
}
