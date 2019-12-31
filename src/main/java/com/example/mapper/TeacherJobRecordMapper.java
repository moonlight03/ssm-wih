package com.example.mapper;
import com.example.entity.TeacherJobRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherJobRecordMapper {
    void save(TeacherJobRecord jd);
}
