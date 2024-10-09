package com.exercise.mapper;

import com.exercise.bean.Passport;

/*
    @author: rasa
    @date:2024/10/9上午11:42
*/
public interface PassportMapper {
    Passport selectPassportByPassengerId(Integer id);
}
