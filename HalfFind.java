package Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/13
 */
public class HalfFind {
    public static int find(int[] array,int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <right) {
            int mid = left+(right-left)/2;
            if (value == array[mid]) {
                return mid;
            } else if (value < array[mid]) {
                left = mid++;
            } else{
                right = mid--;
            }

        }
        return -1;
    }
    //冒泡排序
    public static void Bubblings(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int t=array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //产生一个随机数组
    public static int[] RandomArray(int size){
        Random  ran=new Random();
        int[] array=new int[30];
        for(int i=0;i<array.length;i++){
            array[i]=ran.nextInt(size);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] aa=new int []{1,2,3,4,5,6,7,8,9,15,55,55,5,5,58,8,89,7,7,4,66,};
         Bubblings(aa);
         System.out.println (find(aa,5));
         int[] ints = RandomArray(100);
         System.out.println(Arrays.toString(ints));

    }
}
