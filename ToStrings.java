package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
class Win{
    private String string="杨泰隆";
    private Integer integ=21;
    private char vc='d';

    @Override
    public String toString() {
        return "Win{" +
                "string='" + string + '\'' +
                ", integ=" + integ +
                ", vc=" + vc +
                '}';
    }
}
public class ToStrings {
    public static void main(String[] args){
        Win win=new Win();
        System.out.println(win);
    }
}
