package com.baizhi.cmfz.controller;


import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value="/login",method = {RequestMethod.POST})
    public String login(String mgr_name, String mgr_pwd, String  vCode, ModelMap map, HttpSession session){
        Manager manager = managerService.findmanager(mgr_name,mgr_pwd);

        session.setAttribute("manager",manager);

        String code = (String) session.getAttribute("code");
        System.out.println(manager);
        System.out.println(mgr_name+"==="+mgr_pwd+"-----"+vCode);

        if(vCode != null && vCode.equals(code)){
            if (manager != null){
                return "index";
            }
        }
        return "redirect:/login.jsp";
    }
}
