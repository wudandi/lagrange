package com.dandy.main.reflect;

import java.lang.reflect.Field;

/*
通过反射机制访问对象属性
* */
public class reflectTest03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("com.dandy.main.reflect.Student");
        Object s = c.newInstance();
        Field field = c.getDeclaredField("no");
        field.set(s,20);//给属性赋值
        System.out.println(field.get(s));

        //访问私有属性
        Field nameField = c.getDeclaredField("name");
        //打破私有属性的封装
        nameField.setAccessible(true);
        nameField.set(s,"nb");
        System.out.println(nameField.get(s));
    }
}
