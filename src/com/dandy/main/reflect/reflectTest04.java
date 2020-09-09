package com.dandy.main.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflectTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
         Class c = Class.forName("com.dandy.main.reflect.UserService");
         Method[] methods = c.getDeclaredMethods();
        for (Method method:methods
             ) {
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
            System.out.println(method.getName());

            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType:parameterTypes
                 ) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
