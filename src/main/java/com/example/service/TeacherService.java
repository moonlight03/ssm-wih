package com.example.service;

import com.example.entity.Teacher;
import com.example.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper TeacherMapper;

    public int getTeaCount(){
        return TeacherMapper.getTeaCount();
    }

    public List<Teacher> selectAllTea(){
        return TeacherMapper.selectAllTea();
    }

    public List<Map<String,String>> pageQuery(String sname,Integer currentPage,Integer pagesize){
        currentPage = (currentPage-1) * pagesize;
        return TeacherMapper.pageQuery(sname, currentPage, pagesize);
    }

    public void saveone(Teacher Teacher) {
        TeacherMapper.saveTeacher(Teacher);
    }

    public void updateOne(Teacher Teacher) {
        TeacherMapper.updateOne(Teacher);
    }

    public void delete(String[] split) {
        for(String sid : split){
            TeacherMapper.deleteOne(sid);
        }
    }

    public List<Map<String, String>> getItsClass() {
        return TeacherMapper.getItsClass();
    }
    public List<Map<String, String>> getItsClassById(String id) {
        return TeacherMapper.getItsClassById(id);
    }
}
