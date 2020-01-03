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

    List<Map<String, String>> getItsClass();
    List<Map<String, String>> getItsClassById(String id);

    List<Map<String, String>> getJobByCIdAndTid(String cid, String tid);

    List<Map<String, Object>> getStudentJobByJidAndCid(String cid, String jid);

    void goToUpdateStuScore(String sid, String jid, String score);
}
