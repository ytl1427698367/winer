package com.na;

/**
 * Author：TaiLong
 * created:2019/8/19
 */
public class Sort1 {
    public static void main(String[] args) {
        Sort1 sort1=new Sort1();

                int[] c=new int[]{12,5,8,4,6,655,655,6};
                          sort1.sortArray(c);
        System.out.println("hello");

    }
        public int[] sortArray(int[] sortArray) {
            for(int i=0;i<sortArray.length-1;i++){
                for(int j=i;j<sortArray.length-1-i;j++){
                    if(sortArray[i]>sortArray[j]){
                        int a=sortArray[i];
                        sortArray[i]=sortArray[j];
                        sortArray[j]=a;

                    }
                }

            }

            return sortArray;
        }
}
