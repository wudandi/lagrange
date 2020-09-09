package com.dandy.main.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        //这种方式再idea中当前路径默认的是project的根，换到其他位置当前路径的根就改变了
//        FileReader reader = new FileReader("classinfo.properties");
        //通用路径 : 文件在类路径下(src下), 以src作为起点
        //得到文件的绝对路径，任何系统通用
        String path = Thread.currentThread().getContextClassLoader().getResource("com/dandy/main/reflect/User.class").getPath();
        System.out.println(path);
    }
}
/*
* 类加载器：专门负责加载类的工具ClassLoadler
*       启动类加载器；扩展类加载器；应用类加载器
*
*  */