package com.ming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
public class MapIterator {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap <>();
        map.put(1,"hello");
        map.put(2,"hello");
        map.put(3,"java");
        map.put(4,"wangxiaona");
        map.put(1,"xiaodiandian");
        //因为Map中不提供iterator方法，所以将Map集合转为Set集合
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        //获取iterator对象
        Iterator<Map.Entry<Integer,String>> iterator=entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry);
        }



    }

}
