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

@CrossOrigin
@RestController
@RequestMapping("/stu")
public class StudentController {
    /**
     * @Author 周湘博
     * @param excelFile
     * @throws IOException
     */
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/import", method = RequestMethod.POST)
    @ResponseBody
    public String batchInsert(@RequestParam("excelFile") MultipartFile excelFile) throws IOException {

        String name = excelFile.getOriginalFilename();
        List<Student> list = ExcelUtils.excelToShopIdList(excelFile.getInputStream());
        studentService.save(list);
        return "OK";
    }

    @RequestMapping(value = "/insertone", method = RequestMethod.POST)
    @ResponseBody
    public String InsertOne(@RequestParam(value = "sid") String sid,
                            @RequestParam(value = "sname") String sname,
                            @RequestParam(value = "classid") String classid,
                            @RequestParam(value = "gender") String gender,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "phone") String phone
    ) {
        studentService.saveone(new Student(sid, sname, gender, classid, email,phone));
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String UpdateOne(@RequestParam(value = "sid") String sid,
                            @RequestParam(value = "sname") String sname,
                            @RequestParam(value = "classid") String classid,
                            @RequestParam(value = "gender") String gender,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "phone") String phone) {
        studentService.updateOne(new Student(sid,sname,gender,classid,email,phone));
        return "OK";
    }

    @RequestMapping(value = "/getStuTotal", method = RequestMethod.GET)
    public Integer getStuCount() {
        int stuCount = studentService.getStuCount();
        return stuCount;
    }
    @RequestMapping(value = "/delStu", method = RequestMethod.GET)
    public String deleteStudent(@RequestParam(value = "ids") String ids) {
        String[] split = ids.split(",");
        studentService.delete(split);
        return "OK";
    }

    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> pageQuery(@RequestParam(value = "sname") String sname,
                                               @RequestParam(value = "cid") String classid,
                                               @RequestParam(value = "cur") Integer currentPage,
                                               @RequestParam(value = "size") Integer pagesize) throws IOException {
        List<Map<String, String>> maps = studentService.pageQuery(sname, classid, currentPage, pagesize);
        return maps;
    }


}
