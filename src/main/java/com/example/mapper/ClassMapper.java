package com.example.mapper;

import com.example.entity.StuCla;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ClassMapper {
    public List<StuCla> selectAllStuCla();//12345达萨顶顶q
}
