package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/30
 */

public class ChartoArray {
    public static void main(String[] args)
    {
        String st="hello-word";
        String br="hello word hello java ";
        //实现按照空格拆分字符串
        String[] reslust=br.split(" ");
             for(int i=0;i<reslust.length;i++){
                 System.out.print(reslust[i]+" ");
             }
        System.out.print("\n");
             //实现字符串的截取
        System.out.println(st.substring(4));
        //字符串转大写
        String b=st.toUpperCase();
        System.out.println(b);
        //字符串转小写
        System.out.println(b.toLowerCase());
             //实现字符数组和字符串的相互转换
        char[] charArray=st.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            System.out.print(charArray[i]+"、" );
        }
        System.out.println();
        System.out.println(new String(charArray));
    }
}
