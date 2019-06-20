package com.practise;

/**
 * Author：TaiLong
 * created:2019/6/12
 */
public class june111 {
    public static void main(String[] args){
        june111 m=new june111();
        int[] c=new int[]{1,2,3,2,2};
        m.getValue(c,5);
    }
    public   int getValue(int[] gifts, int n) {
        // write code here
        int a=0;
        for(int i=0;i<gifts.length;i++){
            for(int j=1;j<gifts.length;j++){
                if(gifts[i]==gifts[j]){
                    a++;
                }
                else{
                    continue;
                }


            }
            if(a>=n/2){

                System.out.println(gifts[i]);
                break;
            }

        }
        return 0;
    }
}