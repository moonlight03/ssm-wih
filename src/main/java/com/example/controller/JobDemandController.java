package com.example.controller;
import com.example.entity.JobDemand;
import com.example.entity.TeacherJobRecord;
import com.example.service.JobDemandService;
import com.example.service.TeacherJobRecordService;
import com.example.service.StudentJobRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/jobdemand")
public class JobDemandController {
    @Autowired
    JobDemandService jobDemandService;
    @Autowired
    TeacherJobRecordService jobRecordService;
    @Autowired
    StudentJobRecordService studentJobRecordService;

    @RequestMapping(value = "/savejobdemand", method = RequestMethod.POST)
    @ResponseBody
    public void getItsClass(@RequestParam(value = "cids") String cids,
//                            @RequestParam(value = "deadline") Date deadline,
                            @RequestParam(value = "context") String context,
                            @RequestParam(value = "tid") String tid,
                            @RequestParam(value = "tname") String tname){
        String jid = System.currentTimeMillis()+"";
        jobDemandService.save(new JobDemand(jid,context,new Date()));
        String cidss[] = cids.split(",");
        for(String cid : cidss){
            jobRecordService.save(new TeacherJobRecord(tid,cid,jid));
            studentJobRecordService.save(jid,cid,tname);
        }
    }


}