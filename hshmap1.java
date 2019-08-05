package com.ming;

import java.util.*;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
public class hshmap1 {
    public static void main(String[] args){
        Map<Integer,String> objects=new HashMap<>();
        objects.put(1,"hello");
        objects.put(2,"hello");
        objects.put(1,"hello java   ");
        objects.put(4,"java");
        //获取objeicts中所有key的值
        Set<Integer> set=objects.keySet();
        Iterator<Integer> zhi=set.iterator();
        while(zhi.hasNext()){
            System.out.println(zhi.next());
        }
        System.out.println(objects);
        System.out.println(objects.get(4));
        System.out.println(objects.get(55));
    }
}
