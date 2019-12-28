package com.example.mapper;

import com.example.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherMapper {
    void saveTeacher(Teacher Teacher);
    int getTeaCount();
    List<Teacher> selectAllTea();
    List<Map<String,String>> pageQuery(String tname, Integer currentPage, Integer pagesize);
    void updateOne(Teacher Teacher);

    void deleteOne(String sid);
}
