package Sort;

import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/5/13
 */
public class sfs {
    public static void main(String[] args) {
        int[] aa = new int[]{21, 2, 1, 45, 54, 54545, 454, 5, 4};
//ss(aa);
        fd(aa);

    }
    public  static void ss ( int[] array){
        for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length ; j++) {
                    if (array[j] >= array[i]) {
                        int t = array[j];
                        array[j] = array[i];
                        array[i] = t;
                    }
                }
                }
        System.out.println(Arrays.toString(array));
        }
        public static void fd(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int t=array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }
        }
            System.out.println(Arrays.toString(array));
        }
}
