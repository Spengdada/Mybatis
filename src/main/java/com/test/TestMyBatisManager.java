package com.test;

import com.exercise.bean.User;
import com.exercise.mapper.ManagerMapper;
import com.exercise.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
    @author: rasa
    @date:2024/10/9上午9:30
*/
public class TestMyBatisManager {

    public static void main(String[] args) throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //5.调用接口中的方法
        ManagerMapper managerMapper = sqlSession.getMapper(ManagerMapper.class);
        System.out.println(managerMapper.selectManagerById(1001));
        System.out.println(managerMapper.selectAllManagers());

        //驼峰测试
        ManagerMapper managerMapper1 = sqlSession.getMapper(ManagerMapper.class);
        System.out.println(managerMapper1.selectManagerCamelById("1001"));


    }
}

