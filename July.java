package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/29
 */
class Outter
    {
             private int num;
             public void display(int test)
             {



                 class Inner
                 {
                     private void fun()
                     {
                     num++; System.out.println(num);
                     System.out.println(test);
                 }
                        }
                        new Inner().fun();
             }
    }
    public class July
    {
    public static void main(String[] args)
        {
             Outter out = new Outter();
             out.display(20);
        }
    }