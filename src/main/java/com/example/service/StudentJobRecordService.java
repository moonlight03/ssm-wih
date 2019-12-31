package com.example.service;
 
import com.example.entity.StudentJobRecord;
import com.example.mapper.StudentJobRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentJobRecordService {
    @Autowired
    StudentJobRecordMapper studentJobRecordMapper;

    public void save(String jid, String cid, String tname) {
        List<String> ids = studentJobRecordMapper.findStudentByCid(cid);
        for(String sid:ids){
            studentJobRecordMapper.save(new StudentJobRecord(tname,sid,jid,0));
        }
    }

    public List<Map<String, Object>> getSJRecordById(String sid) {
       return studentJobRecordMapper.findStudentBySid(sid);
    }
}