package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
enum color{
    red,bule,yellow;
}
public class Enums {
    public static void main(String [] args){
        for(color d: color.values()){
            System.out.println(d.name()+d.ordinal());
        }
    }
}
