package com.dandy.main.thread;

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
 * notify()：让增在o对象上等待的线程唤醒，只是通知
 *
 * 需求：仓库采用List集合，这个List集合假设只能存储一个元素，一个元素就表示仓库满了
 *
 * */
public class threadTest2 {

}
