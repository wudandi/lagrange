package com.dandy.main.jdbcDemo;


import java.sql.*;
import java.util.ResourceBundle;

/*
* 注冊驱动
* 获取连接
* 获取数据库操作对象
* 执行sql语句
* 释放资源
* */
public class jdbcTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResourceBundle bundle = ResourceBundle.getBundle("ww");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String username = bundle.getString("username");
        String password = bundle.getString("password");
        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());//注冊驱动
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("driver");
            //获取连接
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","root");
            conn = DriverManager.getConnection("url","username","password");
            //获取数据库操作对象
            stmt = conn.createStatement();
            //执行sql语句
            String sql = "delete from dept where deptno =40";
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1?"删除成功": "删除失败");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //释放连接
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


    }
}
