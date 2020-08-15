package com.dandy.main.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*   collection存放的元素：
*   未使用泛型，可以存储object所有子类型
*   使用泛型，只能存储某个具体的类型
*   (集合中不能直接存储基本数据类型，也不能存储Java对象，只是存储Java对象的地址)
*
*   Collection常用方法：
*       boolean add（Object e）
*       int size() 获取集合中元素的个数
*       c.clear() 清空集合
*       boolean contains()包含
*       boolean remove()删除集合中的某个元素
*       boolean isEmpty() 判断个数是否为0
*       Object[] toArray()吧集合转换成数组
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c =new ArrayList();//多态
        //测试collection接口的常用方法
         c.add(1200);//自动装箱，实际上放的是一个对象的内存地址x   Integer x = new Integer（1200）
         c.add(new Object());

        System.out.println(c.size());//2
        c.clear();
        c.add("nb");
        c.add(1);
        //集合中是否包含nb
        boolean flg=c.contains("nb");
        System.out.println(flg);//true
        System.out.println(c.contains(1));//true


        c.add("100");
        c.add(new cao());
        Iterator it=c.iterator();
        while (it.hasNext()){
            Object ob=it.next();
            System.out.println(ob);
        }
    }
}

class cao{
}