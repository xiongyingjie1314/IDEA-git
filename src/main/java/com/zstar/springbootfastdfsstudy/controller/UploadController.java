package com.zstar.springbootfastdfsstudy.controller;

import com.zstar.springbootfastdfsstudy.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;


    /**
     * 作上传
     */
    @RequestMapping("doUpload")
    public Map<String,Object> doUpload(MultipartFile mf){
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(mf.getOriginalFilename());
        String path = uploadService.uploadImage(mf);
        map.put("path",path);
        return map;
    }

}
