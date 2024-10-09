package com.exercise.mapper;

import com.exercise.bean.Manager;
import com.exercise.bean.ManagerCamel;

import java.util.Set;

/*
    @author: rasa
    @date:2024/10/9上午11:42
*/
public interface ManagerMapper {
    Manager selectManagerById(Integer id);
    Set<Manager> selectAllManagers();
    ManagerCamel selectManagerCamelById(String id);
}
