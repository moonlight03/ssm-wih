package com.example.mapper;

import com.example.entity.Student;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    Page<Student> getStudentList();
}
