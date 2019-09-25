package com.example.mapper;

import com.example.entity.Student;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    void saveStudentList(Student student);
    int getStuCount();
    List<Student> selectAllStu();
    List<Map<String,String>> pageQuery(String sname,String classid,Integer currentPage,Integer pagesize);
}
