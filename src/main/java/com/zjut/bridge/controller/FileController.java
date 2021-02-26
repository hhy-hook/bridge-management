package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.config.web.WebMvcConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class FileController {

    Logger logger = LoggerFactory.getLogger(FileController.class);

    @RequestMapping("report")
    @ResponseBody
    protected JSONObject uploadFile(MultipartFile file){
        JSONObject json = new JSONObject();

        String uploadDir = "/upload/report/";
        String realPath = WebMvcConfig.WINDOW_UPLOAD_PATH;
        String filename = file.getOriginalFilename();
        String filetype = filename.substring(filename.lastIndexOf('.')+1);
        String uploadName = UUID.randomUUID() + "." + filetype;
        File f = new File(realPath + uploadDir,uploadName);
        //System.out.println(f.getParentFile());
        if(!f.getParentFile().exists()){
            f.getParentFile().mkdir();
        }
        try{
            if(!file.isEmpty()){
                if(file.getSize() > 0){
                    file.transferTo(f);
                    logger.info("图片已经保存到："+ realPath + uploadDir + uploadName);
                    json.put("code",0);
                    json.put("data",uploadDir + uploadName);
                    return json;
                }
            }
        } catch ( IOException e){
            e.printStackTrace();
        }
        json.put("code",1);
        return json;
    }
}
