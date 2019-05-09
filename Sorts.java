package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/4/27
 */
public class Sorts {
    public static void interSort(int[]array) {
        int i;
        for( i=0;i<array.length;i++) {
            int j;
            for (j = i - 1; j >= 0 && array[i] < array[j]; j--) {

            }
            int pis = j + 1;
            int key = array[i];
            for (int k = i; k > j + 1; k--) {
                array[k] = array[k - 1];
            }
            array[pis] = key;
        }
    }
public static int  Find(int[] array,int n,int value) {
    int left = 0;
    int right = n-1;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (value < array[mid]) {
            right = mid - 1;
        } else if (value > array[mid]) {
            left = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int[] arr=new int[]{1,22,5,6,5,5,6,8};
        interSort(arr);
       System.out.println(Arrays.toString(arr));
       Find(arr,4,12);
    }


}
