package com.na;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：TaiLong
 * created:2019/8/21
 */
public class FirstList {
    public static void main(String[] args) {
        FirstList firstList=new FirstList();
        firstList.GetLeastNumbers_Solution(new int[]{2,8,8,1,456,64,4,5},252);
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length){
            return null;
        }
        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length-i;j++){
                if(input[i]>input[j]){
                    int v=input[i];
                    input[i]=input[j];
                    input[j]=v;
                }
            }
            System.out.println(input[i]);
        }

        ArrayList<Integer> array=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            array.add(input[i]);
        }
        System.out.println(array);
        return array;
    }
}

