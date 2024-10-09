package com.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/9下午2:38
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private Integer id;
    private String name;
    private Integer grade;
    private List<Student> students;
}

