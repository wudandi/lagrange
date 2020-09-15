package com.dandy.main.collections;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("1","2");
        pro.setProperty("1","2");
        pro.setProperty("1","2");

        System.out.println(pro.getProperty("1"));
    }
}
