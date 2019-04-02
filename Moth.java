//package PACKAGE_NAME;

/**
 * Author：TaiLong
 * created:2019/3/26
 */
public class Moth {
    public static void main(String[] args) {
        System.out.println(add(20,23,23));
        System.out.println(add(20,23));

    }
    public static int add(int a,int b,int c){
              int d=a+b+c;
        return d ;
    }
    //方法的重载
    public static int add(int a,int b){
        int d=a+b;
        return d;
    }
}
