package com.ming;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.Collection;
/**
 * Author：TaiLong
 * created:2019/7/31
 */
public class Arraylist1 {
    public static void main(String[]args)
         {
       // List<String> list=new ArrayList <>();
             Collection<String> list = new ArrayList<>() ;
             System.out.println(list.size()+"\n"+list.isEmpty());
             list.add("hello");
             list.add("hello");
             list.add("王小娜");
             list.add("我爱你");
        System.out.println(list.size()+"\n"+list.isEmpty());
             System.out.println(list);
            // System.out.println(list.remove("hello"));
            // System.out.println(list.contains("敖丙"));
Object[] objects=list.toArray();
             System.out.println(Arrays.toString(objects));

         }
}
