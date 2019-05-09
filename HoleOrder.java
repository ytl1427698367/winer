package Sort;

/**
 * Author：TaiLong
 * created:2019/4/27
 */
//挖坑法
public class HoleOrder {
    public static int partion(int[] array,int left,int right){
        int begin=left;
        int end=right;
        int pivot=array[right];
        while(begin<end){
            while(begin<end&&array[begin]<=pivot){
                begin++;

            }
            array[end]=array[begin];
            while(begin<end&&array[end]>=pivot){
                end--;
            }
            array[begin]=array[end];
        }
        array[begin]=pivot;
        return begin;
    }
}
