package com.example.service;
 
import com.example.entity.JobDemand;
import com.example.entity.JobRecord;
import com.example.mapper.JobDemandMapper;
import com.example.mapper.JobRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobRecordService {
    @Autowired
    JobRecordMapper jobRecordMapper;

    public void save(JobRecord jobDemand) {
        jobRecordMapper.save(jobDemand);
    }
}