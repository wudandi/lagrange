package com.dandy.main.reflect;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
* forName会导致类加载，类加载的时候静态代码块会执行
* */
public class reflectTest01 {
    public static void main(String[] args) {
        try {
            //类加载只执行到静态代码块
            Class.forName("com.dandy.main.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    static{
        System.out.println("myclass静态代码块");
    }

    public MyClass() {
        System.out.println("非静态");
    }
}