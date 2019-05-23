package Sort;

import ThreadPractise.SymbolOut;

import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/4/29
 */

public class ArraySort {
    public static void Sort(int[] array){
        for(int i=0;i<array.length;i++){
            //无序[0,array[length-i]]
            //有序[array[length-i,array[length]]
            int max=0;//最大数的下标
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[max]){
                    max=j;
                    }
            }
            //array[max]就是最大的数，把他放在数组的最后面
            int t=array[max];
            array[max]=array[array.length-i-1];
            array[array.length-i-1]=t;

        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] arrt=new int[]{21,12,21,12,21,2,25,6,564};
        Sort(arrt);

    }
}
