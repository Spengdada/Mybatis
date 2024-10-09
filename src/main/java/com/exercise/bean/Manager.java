package com.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/9上午11:39
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private Integer id;
    private String name;
    private String password;
}

