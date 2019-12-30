package com.example.mapper;
import com.example.entity.JobDemand;
import com.example.entity.JobRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobRecordMapper {
    void save(JobRecord jd);
}
