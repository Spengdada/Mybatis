package com.exercise.mapper;

import com.exercise.bean.Manager;
import com.exercise.bean.ManagerCamel;
import com.exercise.bean.Passenger;

import java.util.Set;

/*
    @author: rasa
    @date:2024/10/9上午11:42
*/
public interface PassengerMapper {
    //嵌套结果映射
    Passenger selectPassengerById(Integer id);
    //嵌套Select查询
    Passenger selectPassengerById2(Integer id);
}
