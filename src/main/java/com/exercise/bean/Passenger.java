package com.exercise.bean;

/*
    @author: rasa
    @date:2024/10/9下午2:03
*/

import lombok.Data;

import java.util.Date;

@Data
public class Passenger {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private Passport passport;
}
