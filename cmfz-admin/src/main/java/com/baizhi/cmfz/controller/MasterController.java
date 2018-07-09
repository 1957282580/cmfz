package com.baizhi.cmfz.controller;


import com.baizhi.cmfz.entity.Master;
import com.baizhi.cmfz.service.MasterService;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/master")
@Controller
public class MasterController {

    @Autowired
    private MasterService masterService;


    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String, Object> selectAll(@RequestParam("page")Integer nowPage , @RequestParam("rows")Integer pageSize,String name,String value){

            if ("master_name".equals(name)){
                System.out.println(name+"======1111111111111========");
                return masterService.findlike1(value,nowPage,pageSize);
            }else if ("introduce".equals("name")){
                System.out.println(name+"=========2222222222222=======");
               return  masterService.findlike2(value,nowPage,pageSize);
            }else {
                System.out.println(name+"==========333333333333333=============");
                return masterService.findAll(nowPage,pageSize);
            }
    }


    @RequestMapping("/insert")
    @ResponseBody
   public void insert(String master_name, String introduce, MultipartFile master_photo, HttpSession session, HttpServletRequest request) throws IOException {



        //1.获得文件夹名称
        String realPath = request.getRealPath("");
        int lastIndexOf = realPath.lastIndexOf("\\");
        String substring = realPath.substring(0, lastIndexOf);
        String uploadPath = substring+"\\upload";

        //2.生成UUID的唯一文件名
        String uuidName = UUID.randomUUID().toString().replace("-","");
        //3截取文件本身的后缀名
        String oldName = master_photo.getOriginalFilename();
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        master_photo.transferTo(new File(uploadPath + "/"+uuidName+suffix));
        String  picture = uuidName + suffix;
        //增加
        Master master = new Master(master_name,uuidName,picture,introduce);
        int result = masterService.insert(master);
    }
    @RequestMapping("/update")
    @ResponseBody
    public void  update(String master_name,String master_id,String introduce,HttpSession session, HttpServletRequest request) throws IOException {
        //修改
        Master master = new Master(master_name,master_id,introduce);

        int result = masterService.update(master);

    }




    @RequestMapping("/batchMaster")
    public String addBatch(MultipartFile file){
        // 参数一：输入流
        // 参数二：pojo
        // 参数三：导入参数对象
        try {
            ImportParams importParams = new ImportParams();

            List<Master> gurus = ExcelImportUtil.importExcel(file.getInputStream(), Master.class, importParams);

            for (Master guru : gurus) {
                System.out.println(guru);
            }
            masterService.addGurus(gurus);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
