package com.test;

import com.exercise.mapper.ManagerMapper;
import com.exercise.mapper.PassengerMapper;
import com.exercise.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*
    @author: rasa
    @date:2024/10/9上午9:30
*/
public class TestMyBatisPassenger {

    public static void main(String[] args) throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象

        PassengerMapper mapper = sqlSession.getMapper(PassengerMapper.class);
        System.out.println(mapper.selectPassengerById(1001));
        mapper.selectPassengerById2(1001);


    }
}

