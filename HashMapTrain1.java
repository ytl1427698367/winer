package com.SortColection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author：TaiLong
 * created:2019/9/9
 */
public class HashMapTrain1 {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap <>();
        map.put(1,"hello");
        map.put(2,"world");
        map.put(3,"Kati");
        map.put(1,"hello c++");
        map.put(52,"djslk");
        System.out.println(map);
        System.out.println(map.get(52));
        //获取map中所有key信息；
        Set<Integer> set=map.keySet();
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
