package com.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/9下午2:23
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String name;
    private String location;
    private List<Employee> emps;
}

