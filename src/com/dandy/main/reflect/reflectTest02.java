package com.dandy.main.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*反射Student类当中的Field(属性)
* */
public class reflectTest02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.dandy.main.reflect.Student");

            // getFields()只能拿到所有公开的属性
            Field[] fields = c.getFields();
            System.out.println(fields.length);
            Field f = fields[0];
            String fieldName=f.getName();
            System.out.println(fieldName);

            //获取所有的Field
            Field[] fs = c.getDeclaredFields();
            System.out.println(fs.length);
            for (Field field:fs) {
                System.out.println(field.getName());//属性的名字
                System.out.println(field.getType().getName());//属性的类型
                //属性的修饰符
                int i = field.getModifiers();
                String s = Modifier.toString(i);
                System.out.println(s);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
