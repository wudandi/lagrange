package com.dandy.main.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {

    public static void main(String[] args) {
        Map<Integer,String> nb=new HashMap<>();

        nb.put(111,"222");
        nb.put(112,"222");
        nb.put(113,"222");
        nb.put(114,"222");
        nb.put(115,"222");

        Set<Map.Entry<Integer,String>> set = nb.entrySet();
        for (Map.Entry<Integer,String> tmd:set){
            System.out.println(tmd);
        }

    }


}
