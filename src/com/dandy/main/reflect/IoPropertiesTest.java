package com.dandy.main.reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) {
        try {
           /* String path = Thread.currentThread().getContextClassLoader()
                    .getResource("class.properties").getPath();
            FileReader reader = new FileReader(path);*/
            InputStream reader = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("class.properties");

            Properties properties = new Properties();
            properties.load(reader);
            reader.close();
            String value=properties.getProperty("className");
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
