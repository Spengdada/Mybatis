package com.exercise.mapper;

import com.exercise.bean.Department;

public interface DepartmentMapper {
    Department selectDepartmentById(Integer id);
    Department selectDepartmentById2(Integer id);
}
