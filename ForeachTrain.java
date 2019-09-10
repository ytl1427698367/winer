package com.SortColection;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：TaiLong
 * created:2019/9/9
 */
public class ForeachTrain {
    public static void main(String[] args){
        List<String> list=new ArrayList <>();
        list.add("1");
        list.add("2");
        list.add("5");
        //用froeach语句输出集合
        for (String x:list) {
            System.out.println(x);
        }
        //将Arraylist转为数组
       Object[] vb=list.toArray();
        for(Object x:vb){
            System.out.println(x);
        }
    }
}
