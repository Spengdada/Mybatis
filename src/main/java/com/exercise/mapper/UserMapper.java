package com.exercise.mapper;

import com.exercise.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User selectUserById(Integer id);
    User selectUserByIdAndPwd(Integer id , String pwd);
    //使用MyBatis提供的@Param进行参数绑定
    User selectUserByIdAndPwd3(@Param("id") Integer id , @Param("pwd") String pwd);
    //添加Map进行参数绑定
    User selectUserByIdAndPwd4(Map values);
    //使用对象属性进行参数绑定
    User selectUserByUserInfo(User user);

    List<User> selectUsersByKeyword(String keyword);

    void deleteUser(Integer id);

    void updateUser(User user);

    void insertUser(User user);
}
