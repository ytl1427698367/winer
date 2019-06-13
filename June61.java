package com.practise;

import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/6/7
 */
public class June61 {
    public static void main(String[] args){
        Scanner  scanner=new Scanner(System.in);//T代表所分的组数
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            int n=scanner.nextInt();//表示要洗的牌的个数一半
            int k=scanner.nextInt();//表示洗牌的次数
            int [] cards=new int[2*n];
            for(int j=0;j<cards.length;j++){
                cards[j]=scanner.nextInt();//输入牌的数值
            }
           for(int cv=0;cv<k;cv++){
                shuffle(cards,n);
           }
           int p=0;
            for(;p<2*n-1;p++){
                System.out.print(cards[p]+" ");
            }
            System.out.println(cards[p]);
        }

    }
    public static void shuffle(int[] cards,int n){//洗牌的过程
        int[] p1=new int[n];
        int[] p2=new int[n];
        int dix=0;
        for(int i=0;i<n;i++){
            p1[i]=cards[i];
        }
for (int j=0;j<n;j++){
            p2[j]=cards[j+n];
}
for(int p=0;p<n;p++){
       cards[dix++]=p1[p];
    cards[dix++]=p2[p];

}
    }


}













