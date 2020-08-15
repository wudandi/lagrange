package com.dandy.main.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    //比较Date()和system.currentTimeMills()获取当前时间的差别
    public static void main(String[] args) {
        //Date函数的无参构造方法获取当先时间
        //得到的是日期字符串（已经重写toString方法）
        Date date = new Date();
        //指定输出时间的格式
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        String s=simpleDateFormat.format(date);
//        System.out.println(s);
        System.out.println(date);


        //system.currentTimeMills()获取的当前时间
        //得到的是一个1970年1月1日0点0分0秒0毫秒到当前时间的总毫秒数（long类型）
        long s1 = System.currentTimeMillis();
        //把总毫秒数转换成指定格式
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        String s=simpleDateFormat.format(s1);
//        System.out.println(s);
        System.out.println(s1);
    }
}
