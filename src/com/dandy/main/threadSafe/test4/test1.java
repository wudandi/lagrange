package com.dandy.main.threadSafe.test4;


//questione：doOther方法执行的时候需要等待dosome结束吗？
// 需要  静态方法是类锁，虽然对象是两个，但是都是一个MyClas类

public class test1 {
    public static void main(String[] args) {
        MyClas mc1 = new MyClas();
        MyClas mc2 = new MyClas();

        Thread t1 = new MyThread(mc1);
        Thread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread{
    private MyClas mc;
    public MyThread(MyClas mc){
        this.mc=mc;
    }
    public void run(){
        if (Thread.currentThread().getName().equals("t1")){mc.doSome();}
        if (Thread.currentThread().getName().equals("t2")){mc.doOther();}
    }
}

class MyClas{
    public synchronized static void doSome(){
        System.out.println("some start");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("some over");
    }

    public synchronized static void doOther(){
        System.out.println("other start");
        System.out.println("other over");
    }
}


