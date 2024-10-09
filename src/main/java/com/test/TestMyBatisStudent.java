package com.test;

import com.exercise.mapper.DepartmentMapper;
import com.exercise.mapper.StudentMapper;
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
public class TestMyBatisStudent {

    public static void main(String[] args) throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.selectAllStudents());



    }
}

