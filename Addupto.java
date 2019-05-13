package Sort;

/**
 * Author：TaiLong
 * created:2019/4/27
 */
//归并排序，也是分治算法
public class Addupto {
    public static void main(String[] args){
        merg(new int[]{2,5,8,6,8,6,2},0,6,3);
    }
    public static void mergeSort(int[] array,int low,int high){
        if(low==high-1){
            return;
        }
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;//平均切开
        mergeSort(array,low,mid);
        mergeSort(array,mid,high);
        merg(array,low,high,mid);
    }
    public static void merg(int[] array,int low,int high,int mid)
    {
        int[] extra=new int[high-low];
        int i=low;
        int j=mid;
        int x=0;
        while (i<=mid&&j<=high){
            if(array[i]<=array[j]){
                extra[x++]=array[i++];
            }
            else{
                extra[x++]=array[j++];
            }

        }
        while(i<mid){
            extra[x++]=array[i++];
        }
        while(j<high){
            extra[x++]=array[j++];
        }
    }
}
