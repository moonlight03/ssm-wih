package com.example.controller;

import com.example.entity.Teacher;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService TeacherService;//

    @RequestMapping(value = "/insertone", method = RequestMethod.POST)
    @ResponseBody
    public String InsertOne(@RequestParam(value = "tid") String tid,
                            @RequestParam(value = "tname") String tname,
                            @RequestParam(value = "gender") String gender,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "phone") String phone
    ) {
        TeacherService.saveone(new Teacher(tid, tname, gender, email,phone));
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String UpdateOne(@RequestParam(value = "tid") String tid,
                            @RequestParam(value = "tname") String tname,
                            @RequestParam(value = "gender") String gender,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "phone") String phone) {
        TeacherService.updateOne(new Teacher(tid,tname,gender,email,phone));
        return "OK";
    }

    @RequestMapping(value = "/getTeaTotal", method = RequestMethod.GET)
    public Integer getTeaCount() {
        int teaCount = TeacherService.getTeaCount();
        return teaCount;
    }
    @RequestMapping(value = "/delTea", method = RequestMethod.GET)
    public String deleteTeacher(@RequestParam(value = "ids") String ids) {
        String[] split = ids.split(",");
        TeacherService.delete(split);
        return "OK";
    }

    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> pageQuery(@RequestParam(value = "tname") String tname,
                                               @RequestParam(value = "cur") Integer currentPage,
                                               @RequestParam(value = "size") Integer pagesize)  {
        List<Map<String, String>> maps = TeacherService.pageQuery(tname, currentPage, pagesize);
        return maps;
    }


}
