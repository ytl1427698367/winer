package com.practise;

/**
 * Author：TaiLong
 * created:2019/6/10
 */
public class june82 {


    public static void main(String[] args){
        june82 b=new june82();
        b.rich();
        b.c();

    }
    public void rich(){
        int sum=0;
        for(int i=0;i<30;i++){
            sum=sum+10;
        }
        System .out .print(sum+" ");
    }
    public void c(){
       long cv=0;
        for(int i=0;i<30;i++){

            cv=2*cv+1;
        }
        System.out.print(cv)   ;
    }
}
