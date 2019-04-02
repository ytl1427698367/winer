/**
 * Author：TaiLong
 * created:2019/4/2
 */
//异常的处理与捕获
public class ProcessExpection {
    public static void main(String[] args)throws Exception {
        System.out.println(calculate(10,0));
    }
      /**
        System.out.println("1数学计算开始前");
        try {
            System.out.println("2数学计算进行中" + 10 / 0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();//取得异常的完整信息
            System.out.println("异常已经被处理");
            }
        System.out.println("3数学计算后");
       */
      public static int calculate(int x,int y)throws Exception{
return x/y;
        }
}
