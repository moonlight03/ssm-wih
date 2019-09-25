package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.utils.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/fanxing/import")
public class ExportController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/batchExport")
    public void batchExport(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1", "周湘博"));
        list.add(new Student("3", "黄奔驰"));
//        List<Student> students = studentService.selectAllStu();

        // Todo 这里是导出所有学生数据，你写一个selectAll，查出来这个list
        //第二步：使用POI将数据写到Excel文件中
        //在内存中创建一个Excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建一个标签页
        HSSFSheet sheet = workbook.createSheet("学生列表");
        //创建标题行
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("学号");
        headRow.createCell(1).setCellValue("姓名");
        String filename = "学生列表.xls";
        for (Student student : list) {
            HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
            dataRow.createCell(0).setCellValue(student.getSid());
            dataRow.createCell(1).setCellValue(student.getSname());
        }
        String contentType = request.getServletContext().getMimeType(filename);
        ServletOutputStream out = response.getOutputStream();
        response.setContentType(contentType);
        String agent = request.getHeader("User-Agent");
        filename = FileUtils.encodeDownloadFilename(filename, agent);
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        workbook.write(out);
    }
}
