package Sort;

import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/4/27
 */
//选择排序
public class Chose {
    public static void main(String[] args) {
        int[] arr = new int[]{121, 2, 6, 3, 56, 323, 50, 20};
        sllectSort(arr);
    }
    public static void sllectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//array[i]到array[length-1]是无序
            for (int j = i + 1; j < array.length; j++) {//array[0]到array[i]是有序部分
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        System.out.print((Arrays.toString(array)));

    }
}
