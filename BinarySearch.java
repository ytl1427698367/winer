package com.SortColection;

/**
 * Author：TaiLong
 * created:2019/8/23
 */
public class BinarySearch {
    public static void main(String[] args) {
BinarySearch binarySearch=new BinarySearch();
binarySearch.search(new int[]{1,2,3,4,5,6,7,8,9,10},6);
    }

    public int search(int[] array,int value) {
        int begin = 0;
        int end = array.length - 1;

        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            if (array[mid] <value) {
                begin= mid + 1;
            }
           else if(array[mid]>value){
              end=mid-1;
            }

            else   {System.out.println(mid);

            break;}
        }

        return  -1;
    }
}
