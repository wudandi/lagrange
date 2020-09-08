package com.dandy.main.thread;

/*
t1-->1
t2-->2
t1-->3
t2-->4
t1-->5
...
*/

public class threadTest3 {
    public static void main(String[] args) {
        //创建仓库对象，共享的
        Num a = new Num();
        //创建两个线程对象
        Thread t1 = new Thread(new thread1(a));
        Thread t2 = new Thread(new thread2(a));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class Num{
    int i = 0;
}


class thread1 implements Runnable{
    private Num num;

    public thread1(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
//        int a = num.i;
        while(true){
            synchronized (num){

                if (num.i % 2 != 0){//奇数
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->" + (++num.i));
                num.notify();
            }
        }
    }
}

class thread2 implements Runnable{
    private Num num;

    public thread2(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
//        int a = num.i;
        while(true){
            synchronized (num){

                if (num.i % 2 == 0){//偶数
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->" + (++num.i));
                num.notify();
            }
        }
    }
}
