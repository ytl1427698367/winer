/**
 * Author：TaiLong
 * created:2019/3/26
 */
//数值类型的相互转换
public class Band {
    //观察变量的默认值
    static class Variable{
      public  int a;
    }
    public static void main(String args[]) {
        char b='a';
        int c=b;
        int d=69;
        char e= (char) d;
        System.out.println(c);//实现字符向整形转换
        System.out.println(e);
        Variable variable=new Variable();
        System.out.println(variable.a);//打印变量a的默认值；
        int num = 310;//定义一个整形常量
        double num1 = num * 3.23;//小数值类型转大数据类型直转
        byte num2 = (int) 22;//大数值类型转小数据类型强转
        System.out.println(num + "\n" + num1 + "\n" + num2 + "\n");
        int num3 = Integer.MAX_VALUE;
        long num4 = Integer.MAX_VALUE + 2;
        byte num5 = Byte.MAX_VALUE - 1;
        System.out.println(num3 + "\n" + num4 + "\n" + num5 + "\n");
    }

}
