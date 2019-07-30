package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/30
 */
//实现子类继承接口和抽象类
    //1.定义个接口
     interface Iinterface{
         public abstract void print();

}
//2.定义一个抽象类
 abstract class AbstractClass{
         abstract void getnews();
 }
 //3.子类实现接口和抽象类
 class Sun extends AbstractClass implements Iinterface{
//4.对接口中的抽象方法进行覆写
         public void print(){
    System.out.println("I am bit");
}
//对抽象类中抽象方法进行覆写
public void getnews(){
    System.out.println("i am biter");
}
 }
public class Test {
         public static void main(String[] args){
        Iinterface b=new Sun();
        b.print();//向上转型
        AbstractClass New=(AbstractClass)b;//向下转型
        New.getnews();

         }
}




