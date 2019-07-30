package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/30
 */
public class MainException {
    public static void main(String [] args)throws Exception{
        String bb="1000";
        int num=Integer.parseInt(bb);
        System.out.println(num);
        System.out.println(num*2);
        chuFa(1,1);
    }
   public static  int chuFa(int a, int b)throws Exception {
        return a/b;
    }
}
