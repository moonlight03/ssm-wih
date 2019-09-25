package com.example.utils;

import com.example.entity.Student;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelUtils.class);
    public static List<Student> excelToShopIdList(InputStream inputStream) {

        //批量保存
        List<Student> list = new ArrayList<>();
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(inputStream);
            inputStream.close();
            //工作表对象
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                int rowNum = row.getRowNum();
                if(rowNum == 0){
                    continue;
                }
                Cell idCell = row.getCell(0);
                idCell.setCellType(Cell.CELL_TYPE_STRING);
                String id = idCell.getStringCellValue();

                Cell nameCell = row.getCell(1);
                nameCell.setCellType(Cell.CELL_TYPE_STRING);
                String name = nameCell.getStringCellValue();

                Student student = new Student(id,name);
                list.add(student);
            }
        } catch (Exception e) {
            LOGGER.error("parse excel file error :", e);
        }
        return list;
    }
}