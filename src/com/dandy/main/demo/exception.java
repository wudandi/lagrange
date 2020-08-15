package com.dandy.main.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exception {
    public static void main(String[] args) throws FileNotFoundException {
        dosome();
        System.out.println("gg");
    }
    public static void dosome() throws FileNotFoundException {
        new FileInputStream("D:\\diao\\diaodeyipi.html");
        System.out.println("cnm");
   }

   //finally子句中的代码是最后执行的，并且一定会执行，
    //finally子句必须和try一起出现，不能单独编写


}

