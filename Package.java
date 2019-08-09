package com.ming;
import com.wate.Test;
/**
 * Author：TaiLong
 * created:2019/7/30
 */
public class Package {
    public static void main(String[] arg){
      System.out.println("数字计算前");
      try {
          System.out.println("计算中"+10/0);
      }
      catch (ArithmeticException e){
          e.printStackTrace();
      }
        System.out.println("计算结束");
    }
}
