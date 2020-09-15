package com.dandy.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SplittableRandom;

public class ArrayListTeest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("zhangsan");
        arrayList.add("lisi");

        String list=arrayList.get(0);
        System.out.println(list);

        for (int i = 0; i < arrayList.size(); i++) {
            String lists = arrayList.get(i);
            System.out.println(lists);
        }

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s:arrayList
             ) {
            System.out.println(s);
        }
    }
}
