package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author:李成达
 */
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    /**
     * @Author 周湘博
     * @param excelFile
     * @throws IOException
     */
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/batchInsertShops", method = RequestMethod.POST)
    @ResponseBody
    public void batchInsert(@RequestParam("excelFile") MultipartFile excelFile) throws IOException {
        String name = excelFile.getOriginalFilename();
        //TODO 业务逻辑，通过excelFile.getInputStream()，处理Excel文件
        List<Student> list =  ExcelUtils.excelToShopIdList(excelFile.getInputStream());
        // TODO 你在这里调用service把这个list存起来
        studentService.save(list);
    }
    @RequestMapping(value = "/getStuCount", method = RequestMethod.POST)
    @ResponseBody
    public int getStuCount() throws IOException {
       return studentService.getStuCount();
    }

    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,String>> pageQuery(@RequestParam(value = "sname") String sname,
                         @RequestParam(value = "cid") String classid,
                         @RequestParam(value = "cur")Integer currentPage,
                         @RequestParam(value = "size")Integer pagesize) throws IOException {
        return studentService.pageQuery(sname, classid, currentPage, pagesize);
    }


}