package com.dandy.main.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // 改变比较器
        TreeSet<Integer> tree = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(11);
        tree.add(1111);
        tree.add(111);
        tree.add(10);
        tree.add(100);

        Iterator<Integer> it = tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("================================");
        for (Integer in:tree
             ) {
            System.out.println(in);
        }

        TreeSet<A> ta = new TreeSet<>();
        ta.add(new A(100));
        ta.add(new A(200));
        ta.add(new A(300));
        ta.add(new A(400));
        ta.add(new A(500));
        for (A a:ta
             ) {
            System.out.println(a);
        }

        TreeSet<B> tb = new TreeSet<>(new BC());
        tb.add(new B(1));
        tb.add(new B(2));
        tb.add(new B(3));
        tb.add(new B(5));
        tb.add(new B(4));
        for (B b:tb
             ) {
            System.out.println(b);
        }
    }
}

class A implements Comparable<A>{
    int i;

    public A() {
    }

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(A o) {
        return this.i - o.i;
    }
}

class B{
    int i;

    public B() {
    }

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}

class BC implements Comparator<B> {

    @Override
    public int compare(B o1, B o2) {
        return o1.i - o2.i;
    }
}