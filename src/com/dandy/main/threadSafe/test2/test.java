package com.dandy.main.threadSafe.test2;


//questione：doOther方法执行的时候需要等待dosome结束吗？（doOther也有synchronized）
// 需要  doOther有synchronized，需要寻找对象锁

public class test {
    public static void main(String[] args) {
        MyClas mc = new MyClas();

        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);

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
    public synchronized void doSome(){
        System.out.println("some start");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("some over");
    }

    public synchronized void doOther(){
        System.out.println("other start");
        System.out.println("other over");
    }
}


