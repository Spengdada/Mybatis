package com.exercise.mapper;

import com.exercise.bean.Subject;

import java.util.List;

public interface SubjectMapper {
    //根据学生id查询课程表和关系表
    List<Subject> selectSubjectByStudentId(Integer id);
}

