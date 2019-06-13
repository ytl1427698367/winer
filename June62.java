package com.practise;

import java.util.Scanner;

public class June62{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int c=sc.nextInt();
            int v=sc.nextInt();
            int num=0;
            String str = sc.nextLine();
            String[] st = str.split(" ");
            int[] arr = new int[c];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(st[i]);

            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]==v){
                    num=num+1;
                }
            }
            System.out.println(num);
        }

    }
}
