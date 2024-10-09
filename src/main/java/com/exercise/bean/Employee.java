package com.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/9下午2:24
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Integer salary;
    private Integer deptId;
    //部门信息
    private Department department;
}

