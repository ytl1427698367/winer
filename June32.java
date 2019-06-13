package com.practise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/6/3
 */
public class June32 {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String str = sc.nextLine();
            String[] st = str.split(" ");
            int[] arr = new int[st.length];
            for (int i = 0; i < arr.    length; i++) {
                arr[i] = Integer.valueOf(st[i]);

            }
            int v=0;
            while(v!=arr.length-1) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {

                        if (arr[j] > arr[j + 1]) {
                            int t = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = t;
                        }

                    }

                }
                v=v+1;

                }
            for(int b=0;b<arr.length;b++)
            {
                if(arr[0]!=0){
                    break;
                }
                else if(arr[0]==0) {
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]==0){
                            continue;
                        }
                    int t = arr[0];
                    arr[0] = arr[i];
                    arr[i] = 0;

                        break;
                    }

                    }

            }
            System.out.println(Arrays.toString(arr));
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }

    }


    }
}
