package JavaIo;

import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/4/23
 */
public class Scanner1 {
    public static void main(String[] args){
        Scanner scaner=new Scanner(System.in);
        System.out.println("请输入数据");

        if(scaner.hasNextInt()){
            int age=scaner.nextInt();
            System.out.println("输入内容为"+age);
        }
        else{
            System.out.println("输入的不是数字");
        }
        scaner.close();
    }
}
