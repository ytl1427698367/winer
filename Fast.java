package Sort;

/**
 * Author：TaiLong
 * created:2019/4/27
 */
public class Fast {
    private static int parition(int[] array,int left,int right){
        int begin=left;
        int end=right;
        int pivot=array[right];
        while(begin<end){
            while(begin<end&&array[begin]<=pivot){
                begin++;
            }
            while(begin<end&&array[end]>=pivot){
                end--;
            }
        }
        return begin;
    }
    public static void main(String[] args){
        parition(new int[]{12,23,23,53,5,6},0,5);
        System.out.println();
    }
}
