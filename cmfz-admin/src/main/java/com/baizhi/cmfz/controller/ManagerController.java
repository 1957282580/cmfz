package com.baizhi.cmfz.controller;


import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;


@Controller
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value="/login",method = {RequestMethod.POST})
    public String login(String mgr_name, String mgr_pwd, String  vCode,String cbx ,ModelMap map, HttpSession session,  HttpServletResponse response) throws Exception{
        Cookie cookie = new Cookie("username", URLEncoder.encode(mgr_name,"utf-8"));
        cookie.setPath("/");
        response.addCookie(cookie);

        Manager manager = managerService.findmanager(mgr_name,mgr_pwd);

        session.setAttribute("manager",manager);

        String code = (String) session.getAttribute("code");


        if(vCode != null && vCode.equals(code)){
            if (manager != null){
                if (cbx != null){
                    Cookie cookie1 = new Cookie("password", URLEncoder.encode(mgr_pwd,"utf-8"));
                    cookie.setPath("/");
                    response.addCookie(cookie1);

                }else{
                    Cookie cookie1 = new Cookie("password",URLEncoder.encode(mgr_pwd,"utf-8"));
                    cookie1.setMaxAge(0);
                    cookie.setPath("/");
                    response.addCookie(cookie1);

                }
                return "redirect:/main/main.jsp";
            }
        }





        return "redirect:/login.jsp";
    }
}
