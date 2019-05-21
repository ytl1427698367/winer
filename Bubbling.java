package Sort;

import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/5/10
 */
//冒泡排序
public class Bubbling {
    public static void BSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]<array[j+1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }


            }

        }
        System.out.println((Arrays.toString(array) ));

    }
    public static void main(String[] args){
        int[] array=new int[]{22,23,3,5,63,56,5};
        BSort(array);
}
}