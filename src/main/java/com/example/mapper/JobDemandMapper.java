package com.example.mapper;
import com.example.entity.JobDemand;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface JobDemandMapper {
    void save(JobDemand jd);
}
