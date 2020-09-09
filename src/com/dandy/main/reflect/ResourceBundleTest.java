package com.dandy.main.reflect;

import java.util.ResourceBundle;

//资源绑定器，便于获取属性配置文件中的内容
//这种方式的属性配置文件必须放到类路径下面
public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定properties文件，必须以类路径为根路径为起点，写路径的时候，路径的properties扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("com/dandy/main/reflect/ww");
        String calssName=bundle.getString("className");
        System.out.println(calssName);
    }
}
