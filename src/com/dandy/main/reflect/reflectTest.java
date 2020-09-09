package com.dandy.main.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
* 获取class的三种方法：1.Class c = Class.forName("完整类名") 2.Class c = 对象.getClass() 3.Class c = 任何类型.class
* 通过class的newInstance()方法来实例化对象，实际上这个方法调用了无参构造方法
*
* 验证反射机制的灵活性
* */
public class reflectTest {
    public static void main(String[] args) {
        try {
            //通过IO流读取classinfo.properties文件
            FileReader reader = new FileReader("classinfo.properties");
            //创建属性对象Map
            Properties properties = new Properties();//键值都是String
            //加载
            properties.load(reader);
            //关闭流
            reader.close();
            //通过key获取value
            String className = properties.getProperty("className");
//            System.out.println(className);
            //通过反射机制实例化对象
            Class c = Class.forName(className);
            Object object = c.newInstance();
            System.out.println(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
