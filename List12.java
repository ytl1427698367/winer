package com.SortColection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Author：TaiLong
 * created:2019/9/9
 */
public class List12 {
    public static void main(String[] args){
        List<String> list=new ArrayList <>();
        Collections.addAll(list,"hello","王小娜","hello","Lenghanhan");
        System.out.println(list);
        Stream<String>  str=list.stream();
        System.out.println(str.count());
    }
}
