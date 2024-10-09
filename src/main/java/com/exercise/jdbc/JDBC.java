package com.exercise.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.exercise.bean.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
    @author: rasa
    @date:2024/10/9上午9:14
*/
public class JDBC {
    public static void main(String[] args) throws SQLException {
        //创建德鲁伊数据源
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        //获得数据库连接
        Connection connection = druidDataSource.getConnection();
        //需要执行的sql
        String sql = "select * from book";

        //获得操作sql语句的对象
        PreparedStatement ps = connection.prepareStatement(sql);
        //执行sql
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<>();
        //将表的数据转成对象
        while (rs.next()){
            Integer id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            Book book = new Book();
            book.setId(id);
            book.setName(name);
            book.setAuthor(author);
            list.add(book);
        }
        System.out.println(list);
    }
}
