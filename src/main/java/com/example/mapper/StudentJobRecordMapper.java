package com.example.mapper;
import com.example.entity.StudentJobRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentJobRecordMapper {
    void save(StudentJobRecord jdr);
    List<String> findStudentByCid(String cid);
    List<Map<String, Object>> findStudentBySid(String sid);

    void updateBySidAndJid(String sid, String jid, String path);
}
