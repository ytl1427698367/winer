package Sort;

/**
 * Author：TaiLong
 * created:2019/5/13
 */
public class HalfFind {
    public static int find(int[] array,int value) {
        int left = 0;
        int right = array.length-1;
        while (left <=right) {
            int mid = left + ((right - left) >> 2);
            if (array[value] > array[mid]) {
                left = mid + 1;
            }
           else if (array[value] < array[mid]) {
                right = mid - 1;
            }
            if(value==array[mid]){
                return mid;
            }
            else {
                return mid;
            }

        }
        return -1;


    }
    public static void main(String[] args){
        int[] aa=new int []{1,2,3,4,5,6,7,8,9};
        find(aa,5);
    }
}
