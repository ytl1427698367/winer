package com.SortColection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author：TaiLong
 * created:2019/9/9
 */
public class Hashmaprain2 {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap <>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.put(1,"e");
        //将Map集合变为set输出。
        System.out.println(map);
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> e=iterator.next();
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
