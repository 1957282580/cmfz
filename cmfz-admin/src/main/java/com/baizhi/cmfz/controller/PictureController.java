package com.baizhi.cmfz.controller;


import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import com.baizhi.cmfz.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/Picture")
public class PictureController {


    @Autowired
    private PictureService pictureService;


    @RequestMapping("/PictureAll")
    @ResponseBody
    public Map<String, Object> findAll(@RequestParam("page")Integer nowPage , @RequestParam("rows")Integer pageSize) {

        return pictureService.findAll(nowPage,pageSize);
    }


    @RequestMapping("/add")
    @ResponseBody
    public void insert(String picture_descripti, String picture_status, MultipartFile myFile , HttpSession session, HttpServletRequest request) throws IOException {

        //1.获得文件夹名称
        String realPath = request.getRealPath("");
        int lastIndexOf = realPath.lastIndexOf("\\");
        String substring = realPath.substring(0, lastIndexOf);
        String uploadPath = substring+"\\upload";

        //2.生成UUID的唯一文件名
        String uuidName = UUID.randomUUID().toString().replace("-","");
        //3截取文件本身的后缀名
        String oldName = myFile.getOriginalFilename();
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        myFile.transferTo(new File(uploadPath + "/"+uuidName+suffix));
        String  picture_path = uuidName + suffix;
        //增加
        Picture picture = new Picture(uuidName,picture_path,picture_descripti,picture_status);

        System.out.println(picture);

        pictureService.insert(picture);


    }

    @RequestMapping("/update")
    @ResponseBody
    public void update(String picture_id,String picture_descripti, String picture_status, MultipartFile myFile , HttpSession session, HttpServletRequest request) throws IOException {

        //1.获得文件夹名称
        String realPath = request.getRealPath("");
        int lastIndexOf = realPath.lastIndexOf("\\");
        String substring = realPath.substring(0, lastIndexOf);
        String uploadPath = substring+"\\upload";

        //2.生成UUID的唯一文件名
        String uuidName = UUID.randomUUID().toString().replace("-","");
        //3截取文件本身的后缀名
        String oldName = myFile.getOriginalFilename();
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        myFile.transferTo(new File(uploadPath + "/"+uuidName+suffix));
        String  picture_path = uuidName + suffix;
        //增加
        Picture picture = new Picture(picture_id,picture_path,picture_descripti,picture_status);
        pictureService.update(picture);
    }
}
