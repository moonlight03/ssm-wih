package com.example.controller;

import com.example.service.StudentJobRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/sjrecord")
public class StudentJobRecordController {
    @Autowired
    StudentJobRecordService studentJobRecordService;

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> getSJRecordById(@RequestParam(value = "sid") String sid)  {
        List<Map<String, Object>> maps = studentJobRecordService.getSJRecordById(sid);
        return maps;
    }

    @RequestMapping(value = "/pushmyjob", method = RequestMethod.POST)
    @ResponseBody
    public String pushMyJob(@RequestParam(value = "sid") String sid,
                            @RequestParam(value = "jid") String jid,
                            @RequestParam(value = "file") MultipartFile file
                            )  {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "//Users//lixiang//Documents//image//"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = "/image/" + fileName;
        studentJobRecordService.updateBySidAndJid(sid,jid,path);
        return "OK";
    }

}