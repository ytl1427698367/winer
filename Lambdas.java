package com.ming;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
interface  Ass{
    public int add(int s,int y);
}

public class Lambdas {
    public static void main(String[] args){
        Ass sdd=(s,k)->s+k;
        System.out.println(sdd.add(23,56));
    }
}
