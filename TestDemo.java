package com.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author：TaiLong
 * created:2019/6/12
 */
public class TestDemo {

        public static void main(String[] args) {
            List <String> list = new ArrayList();
            list.add("hello");
            list.add("hekko");
            list.add("cvb");
            Iterator<String> iterator=list.iterator();
            while(iterator.hasNext()){
                String str=iterator.next();
                System.out.println(str);
            }
        }

    }
