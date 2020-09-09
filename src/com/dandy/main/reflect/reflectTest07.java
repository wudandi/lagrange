package com.dandy.main.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*通过反射机制调用构造器*/
public class reflectTest07 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("com.dandy.main.reflect.User");
        Object o =c.newInstance();
        Constructor constructor = c.getConstructor();//nmb
        Object obj = constructor.newInstance();//nmb
        System.out.println(obj);//toString
    }
}
