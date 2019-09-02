package com.SortColection;

import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/8/23
 */
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.Sort(new int[]{2,855,5,3,5,2,66,2,2,5,6,2,2,6,6,5,66,5,2,5,5,5});
    }
    public int[] Sort(int[] Array){
        for(int i=0;i<Array.length-1;i++){
            for(int j=0;j<Array.length-i-1;j++){
                if(Array[j]>Array[j+1]){
                    int temp=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;
                }
        }
    }
        System.out.println(Arrays.toString(Array));
    return Array;
}
}
