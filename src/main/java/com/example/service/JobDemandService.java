package com.example.service;
 
import com.example.entity.JobDemand;
import com.example.mapper.JobDemandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobDemandService {
    @Autowired
    JobDemandMapper jobDemandMapper;

    public void save(JobDemand jobDemand) {
        jobDemandMapper.save(jobDemand);
    }
}