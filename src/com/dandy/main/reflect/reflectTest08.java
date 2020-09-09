package com.dandy.main.reflect;

public class reflectTest08 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.String");
        //获取String的父类
        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());

        Class[] interfaces = c.getInterfaces();
        for (Class interfacess:
             interfaces) {
            System.out.println(interfacess.getSimpleName());
        }
    }
}
