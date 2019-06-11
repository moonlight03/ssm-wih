package com.example.service;

import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;


@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public  void save(List<Student> students){
        for (Student student:students) {
            studentMapper.saveStudentList(student);
        }
    }
    public int getStuCount(){
        return studentMapper.getStuCount();
    }

    public List<Student> selectAllStu(){
        return studentMapper.selectAllStu();
    }

    public List<Map<String,String>> pageQuery(String sname,String classid,Integer currentPage,Integer pagesize){
        currentPage = (currentPage-1) * pagesize;
        return studentMapper.pageQuery(sname, classid, currentPage, pagesize);
    }
}
