package com.dandy.main.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 * 使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        //指定定时任务
//        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstDate = new Date();//sdf.parse("2020-09-03 17:07:00");
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次)
        timer.schedule(new LogTimerTask(),firstDate,1000*2);

    }
}

//定时任务类
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        //定时任务内容
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        System.out.println(time + "备份任务");
    }
}