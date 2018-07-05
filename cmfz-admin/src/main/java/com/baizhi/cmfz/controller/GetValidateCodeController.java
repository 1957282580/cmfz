package com.baizhi.cmfz.controller;


import com.baizhi.cmfz.util.NewValidateCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



        /*
        User: zhangbohao
        Date: 2018/7/4
        */

@Controller
@RequestMapping("/vCode")
public class GetValidateCodeController{
    @RequestMapping("/getVcode")
    public void create(HttpSession session, HttpServletResponse response ) throws IOException {

        //1创建工具对象，并生成验证码
        NewValidateCodeUtils vCode = new NewValidateCodeUtils(80,30,1,60);

        //2保存在Session作用域
        session.setAttribute("code",vCode.getCode());

        //3.使用response获得指向客户端的流对象，并输出
        vCode.write(response.getOutputStream());
    }
}
