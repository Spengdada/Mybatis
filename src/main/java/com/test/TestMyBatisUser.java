package com.test;

import com.exercise.bean.User;
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
public class TestMyBatisUser {

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
        System.out.println(userMapper.selectUserById(1));

        Map<String,Object> map = new HashMap<>(); //测试类创建Map
        map.put("myId",1); //自定义key，绑定参数
        map.put("myPwd","123");
        System.out.println(userMapper.selectUserByIdAndPwd4(map));

        User user = new User();
        user.setId(1);
        user.setPassword("123");
        System.out.println(userMapper.selectUserByUserInfo(user));

        userMapper.deleteUser(4);
        sqlSession.commit();//增删改需要session.commit()或者session.close()

        User user1 = new User(1, "aaa", "456", "男", new Date(), new Date());
        userMapper.updateUser(user1);
        sqlSession.commit();

        User user2 = new User(6, "qqq", "678", "男", new Date(), new Date());
        userMapper.insertUser(user2);
        sqlSession.commit();


    }
}

