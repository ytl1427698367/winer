import java.io.IOException;

/**
 * Author：TaiLong
 * created:2019/3/26
 */
public class Catch {
    public static void main(String args[]) throws IOException {
        System.out.println("请输入数字");
        int num=(int)System.in.read();

        while(num<0&&num>60) {
            System.out.println("输入的数字不正确，请重新输入");
            break;
          }
        switch(num){
            case 1 :{
                System.out.println("我是第一名");
                break;
            }
            case 2 :{
                System.out.println("我是第二名");
                break;
            }
            case 3 :{
                System.out.println("我是第三名");
                break;
            }
            default:{
                System.out.println("我没考好");
                break;
            }
        }
    }
}
