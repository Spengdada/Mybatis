package com.exercise.mapper;

import com.exercise.bean.Student;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/9下午2:40
*/
public interface StudentMapper {
    //嵌套结果映射
    List<Student> selectAllStudents();
    //嵌套Select查询
    List<Student> selectAllStudents2();
}
