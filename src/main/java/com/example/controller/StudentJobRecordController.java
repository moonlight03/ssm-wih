package com.example.controller;

import com.example.service.StudentJobRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

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
}