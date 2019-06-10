package com.example.mapper;

import com.example.entity.Student;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //Page<Student> getStudentList();
    void saveStudentList(Student student);
    int getStuCount();
    List<Student> selectAllStu();
}
