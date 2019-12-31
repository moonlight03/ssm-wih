package com.example.controller;
import com.example.entity.JobDemand;
import com.example.entity.JobRecord;
import com.example.service.JobDemandService;
import com.example.service.JobRecordService;
import com.example.service.StudentJobRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/studentjobrecord")
public class StudentJobRecordController {
    @Autowired
    StudentJobRecordService studentJobRecordService;

    @RequestMapping(value = "/getsjrecordById", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getSJRecordById(@RequestParam(value = "sid") String sid)  {
        List<Map<String, String>> maps = studentJobRecordService.getSJRecordById(sid);
        return maps;
    }
}