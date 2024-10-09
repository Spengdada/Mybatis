package com.exercise.bean;

/*
    @author: rasa
    @date:2024/10/9下午2:04
*/

import lombok.Data;

import java.util.Date;

@Data
public class Passport {
    private Integer id;
    private String nationality;
    private Date expire;
    private Integer passengerId;
    private Passenger passenger;
}

