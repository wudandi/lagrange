package com.dandy.main.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的第三种方式：
 *      实现Callable接口
 */
public class threadTest1 {
    public static void main(String[] args) throws Exception {
        //创建一个“未来认为”对象
        FutureTask task = new FutureTask(new Callable() {//匿名内部类
            @Override
            public Object call() throws Exception {// call() 方法相当于run() 方法（有返回值）
                //模拟执行
                System.out.println("call begin");
                Thread.sleep(1000*2);
                System.out.println("call over");
                int a= 1;int b=2;
                return a+b;//自动装箱变成Integer
            }
        });
        //创建线程对象
        Thread t=new Thread(task);
        //启动线程
        t.start();
        //在主线程中怎么获取t线程的执行结果
        // get方法的执行可能会导致当前线程的阻塞
        Object object =task.get();
        System.out.println(object+"执行结束");
        //main 方法想要执行到这儿必须等待get()方法的结束
        System.out.println("草泥马");
    }
}
