package com.practise;
import java.lang.Math;
/**
 * Author：TaiLong
 * created:2019/6/10
 */
public class june822 {
    public static void main(String[]
                                    args){ long sumRich=0;
        long sumStranger=0;
        for(int i=1;i<=30;i++){
            sumRich+=10;//累加10（万）
            sumStranger=sumStranger+(long)Math.pow(2,i-1);//累加2的n-1次方（分）
        }
        System.out.print(sumRich+" "+sumStranger);
    }
}
