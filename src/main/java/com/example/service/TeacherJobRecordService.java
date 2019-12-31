package com.example.service;
 
import com.example.entity.TeacherJobRecord;
import com.example.mapper.TeacherJobRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherJobRecordService {
    @Autowired
    TeacherJobRecordMapper jobRecordMapper;

    public void save(TeacherJobRecord jobDemand) {
        jobRecordMapper.save(jobDemand);
    }
}