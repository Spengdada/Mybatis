package com.exercise.mapper;

import com.exercise.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectEmployeeByDepartmentId(Integer id);

    //查询所有员工以及关联的部门信息
    List<Employee> selectAllEmployees();
}

