package com.test;

import com.exercise.bean.Order;
import com.exercise.bean.Product;
import com.exercise.mapper.OrderMapper;
import com.exercise.mapper.ProductMapper;
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
public class TestMyBatisOrder {

    public static void main(String[] args) throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        //5.调用接口中的方法
        Order order = new Order();
        order.setName("订单一");
        orderMapper.insertOrder(order);
        System.out.println("返回的id:"+order.getId());//uuid生成的id回填到了order中
        sqlSession.commit();


    }
}

