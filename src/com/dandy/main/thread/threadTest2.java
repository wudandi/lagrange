package com.dandy.main.thread;

import java.util.ArrayList;
import java.util.List;

/*
 * 使用wait方法和notify方法 实现”生产者和消费者模式“
 *      生产线程负责生产，消费线程负责消费
 *      两个线程要达到均衡
 *      这是特殊的业务需求，需要使用wait方法和notify方法
 * wait和notify方法不是线程对象的方法，而是普通java对象都有的方法
 *
 * wait方法和notify方法建立在线程同步的基础之上，因为多线程要同时操作一个仓库，要实现线程安全
 *
 * wait()：让正在o对象上获取的线程进入等待状态，并释放之前占有的对象锁
 *
 * notify()：让正在o对象上等待的线程唤醒，只是通知,不释放之前占有的对象锁
 *
 * 需求：仓库采用List集合，这个List集合假设只能存储一个元素，一个元素就表示仓库满了
 *
 * */
public class threadTest2 {
    public static void main(String[] args) {
        //创建仓库对象，共享的
        List list= new ArrayList();
        //创建两个线程对象
        Thread t1 = new Thread(new productor(list));
        Thread t2 = new Thread(new comsumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}
//生产线程
class productor implements Runnable{
    private List list;

    public productor(List list) {
        this.list = list;
    }

    @Override
        public void run() {
        //生产（死循环模拟一直生产）
            while(true){
                //给仓库对象加锁
                 synchronized (list){
                     //大于0，说明仓库已经有一个元素了
                     if (list.size()>0){
                         try {
                             list.wait();//仓库已经空了，释放list集合的锁
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                     //程序执行到这里说明仓库是空的,执行生产
                     list.add(new Object());
                     System.out.println(Thread.currentThread().getName()+"正在生产");
                     //唤醒消费者消费
                     list.notify();
                 }
            }
        }
    }
//消费线程
class comsumer implements Runnable{
    private List list;

    public comsumer(List list) {
        this.list = list;
    }

    @Override
        public void run() {
            while(true){
                //仓库已经空了，释放list集合的锁
                synchronized (list){
                    if (list.size()==0){
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //程序执行到这儿说明仓库有数据，进行消费
                    list.remove(0);
                    System.out.println(Thread.currentThread().getName()+"正在消费");
                    //唤醒生产者生产
                    list.notify();
                }
            }
        }
    }
