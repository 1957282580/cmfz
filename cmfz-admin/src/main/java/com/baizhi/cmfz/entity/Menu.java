package com.baizhi.cmfz.entity;

import java.io.Serializable;
import java.util.List;

public class Menu  implements Serializable {

    private String menu_id;//菜单id
    private String menu_name;//菜单所有分栏名称
    private String menu_code;//菜单所有分栏英文名
    private String menu_icon;//菜单图标
    private String menu_url;//页面url
    private String menu_level;//等级
    private String menu_paret_id;//父id

    private List<Menu> secondMenuList;

    public Menu() {
    }

    public Menu(String menu_id, String menu_name, String menu_code, String menu_icon, String menu_url, String menu_level, String menu_paret_id) {
        this.menu_id = menu_id;
        this.menu_name = menu_name;
        this.menu_code = menu_code;
        this.menu_icon = menu_icon;
        this.menu_url = menu_url;
        this.menu_level = menu_level;
        this.menu_paret_id = menu_paret_id;
    }

    public Menu(String menu_id, String menu_name, String menu_code, String menu_icon, String menu_url, String menu_level, String menu_paret_id, List<Menu> secondMenuList) {
        this.menu_id = menu_id;
        this.menu_name = menu_name;
        this.menu_code = menu_code;
        this.menu_icon = menu_icon;
        this.menu_url = menu_url;
        this.menu_level = menu_level;
        this.menu_paret_id = menu_paret_id;
        this.secondMenuList = secondMenuList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu_id='" + menu_id + '\'' +
                ", menu_name='" + menu_name + '\'' +
                ", menu_code='" + menu_code + '\'' +
                ", menu_icon='" + menu_icon + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", menu_level='" + menu_level + '\'' +
                ", menu_paret_id='" + menu_paret_id + '\'' +
                ", secondMenuList=" + secondMenuList +
                '}';
    }

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_code() {
        return menu_code;
    }

    public void setMenu_code(String menu_code) {
        this.menu_code = menu_code;
    }

    public String getMenu_icon() {
        return menu_icon;
    }

    public void setMenu_icon(String menu_icon) {
        this.menu_icon = menu_icon;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public String getMenu_level() {
        return menu_level;
    }

    public void setMenu_level(String menu_level) {
        this.menu_level = menu_level;
    }

    public String getMenu_paret_id() {
        return menu_paret_id;
    }

    public void setMenu_paret_id(String menu_paret_id) {
        this.menu_paret_id = menu_paret_id;
    }

    public List<Menu> getSecondMenuList() {
        return secondMenuList;
    }

    public void setSecondMenuList(List<Menu> secondMenuList) {
        this.secondMenuList = secondMenuList;
    }
}
