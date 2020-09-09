package com.dandy.main.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*反编译*/
public class reflectTest05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.dandy.main.reflect.UserService");
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(c.getModifiers()) + "class" + c.getSimpleName() + "{" + "\n");
        Method[] methods = c.getDeclaredMethods();
        for (Method method:methods){
            s.append("\t" + Modifier.toString(method.getModifiers()) + " ");
            s.append(method.getReturnType().getSimpleName() + " ");
            s.append(method.getName() + "(");
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType:parameterTypes
                 ) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length!=0){
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
