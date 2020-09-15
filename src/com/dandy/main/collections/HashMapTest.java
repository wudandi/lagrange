package com.dandy.main.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zs");
        map.put(2,"ls");
        map.put(4,"ww");
        map.put(3,"qw");
        map.put(3,"11");
        System.out.println(map.size());

        Set<Integer> keys = map.keySet();
        for (Integer i:keys
             ) {
            System.out.println(i + "=" + map.get(i));
        }

        Set<Map.Entry<Integer,String>> nodes = map.entrySet();
        for (Map.Entry<Integer,String> maps:nodes
             ) {
            System.out.println(maps);
        }
    }
}
