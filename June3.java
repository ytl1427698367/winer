package com.practise;

import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/6/3
 */
public class June3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int b = num * num * num;
            int v = b / num;
            int s = v - 2 * (num / 2);
            if (num % 2 != 0) {
                for (int i = 0; i < num; i++) {
                    if(i==num-1){
                        System.out.println(s);
                    }
                    if(i<num-1){
                    System.out.print(s + "+");
                    s = s + 2;}

                }

            }
            if (num % 2 == 0) {
                for (int i = 0; i < num; i++) {
                    if(i==num-1){
                        System.out.println(s+1);
                    }
                    if(i<num-1){
                        System.out.print(s+1 + "+");
                        s = s + 2;}

                }
            }
        }
    }}

