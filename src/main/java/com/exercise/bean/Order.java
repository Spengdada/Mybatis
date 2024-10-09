package com.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/9上午10:42
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private String name;
}
