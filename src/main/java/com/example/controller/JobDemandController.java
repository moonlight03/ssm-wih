package com.example.controller;
 
import com.example.entity.JobDemand;
import com.example.entity.JobRecord;
import com.example.service.JobDemandService;
import com.example.service.JobRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/jobdemand")
public class JobDemandController {

    @Autowired
    JobDemandService jobDemandService;
    @Autowired
    JobRecordService jobRecordService;
    @RequestMapping(value = "/savejobdemand", method = RequestMethod.POST)
    @ResponseBody
    public void getItsClass(@RequestParam(value = "cids") String cids,
                            @RequestParam(value = "deadline") Date deadline,
                            @RequestParam(value = "context") String context,
                            @RequestParam(value = "tid") String tid)  {
        String jid = System.currentTimeMillis()+"";
        jobDemandService.save(new JobDemand(jid,context,deadline));
        String cidss[] = cids.split(",");
        for(String cid : cidss){
            jobRecordService.save(new JobRecord(tid,cid,jid));
        }
    }


}