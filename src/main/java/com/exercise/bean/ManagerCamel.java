package com.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/9下午1:47
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManagerCamel {
    private String mgrId;//与字段mgr_id对应
    private String mgrName;//与字段mgr_name对应
    private String mgrPwd;//与字段mgr_pwd对应
}