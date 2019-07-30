package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/30
 */
public class StringBufferSaw {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer();
        s.append("hello");
        s.append("world");
        String v="1230";
        System.out.println(s);
        //字符串的反转
        System.out.println(s.reverse());
        //指定范围删除字符串
        System.out.println(s.delete(0,4));
        //字符串插入操作
        System.out.println(s.insert(0,"dlro"));
        System.out.println(s.reverse());
        Integer num1 = new Integer(10) ;
        Integer num2 = new Integer(10) ;
        System.out.println(num1 == num2);
        System.out.println(num1 == new Integer(10));
        System.out.println(num1.equals(new Integer(10)));
        //将字符串转换为int型
        int num=Integer.parseInt(v);
        System.out.println(v);
        //将字符串变成double类型
        Double numk=Double.parseDouble(v);
        System.out.println(v);

    }

}
