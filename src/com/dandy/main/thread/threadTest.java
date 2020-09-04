package com.dandy.main.thread;


/**
 * 守护线程
 */
public class threadTest {
    public static void main(String[] args) {
        Thread t = new BakeDateThread();
        t.setName("备份数据的线程");
        //启动线程之前，设置为守护线程
        t.setDaemon(true);
        t.start();


        //主线程：用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakeDateThread extends Thread{
    public void run(){
        int i = 0;
        //即使是死循环，守护线程也会在用户线程结束的时候结束
        while (true){
            System.out.println(Thread.currentThread().getName() + "----------------------------------------" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}