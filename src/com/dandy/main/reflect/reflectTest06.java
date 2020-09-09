package com.dandy.main.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*通过反射机制调用一个对象的方法*/
public class reflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("com.dandy.main.reflect.UserService");
        Object o = c.newInstance();// 对象
        Method loginMethod = c.getDeclaredMethod("login",String.class,String.class);//方法
        Object obj = loginMethod.invoke(o,"admin","123");//方法返回值
        System.out.println(obj);
    }
}
