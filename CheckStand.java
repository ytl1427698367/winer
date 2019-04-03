/**
 * Author：TaiLong
 * created:2018/12/4
 */
import java.util.Scanner;
public class CheckStand {
    class Goods{
        //商品编号
        private int id;
        //商品名称
        private String name;
        //商品价格
        private double price;
        public Goods(int id,String name,double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }
        public int getId(){
            return this.id;
        }
        public String getName(){
            return this.name;
        }
        public double getPrice(){
            return this.price;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setPrice(double price){
            this.price = price;
        }
    }
    class Order{

    }
    //private static Scanner scanner = new Scanner(System.in);
    public static void helpInfo() {
        System.out.println("*****************欢迎使用简易收银台*********************");
        System.out.println("    U  使用   G  关于   S   设置   T   退出   ");
        System.out.println("          选择    U     G     S    T    进行操作       ");
        System.out.println("*****************************************************");

    }
    public static void drop(){
        System.out.println("*****************************************************");
        System.out.println("             欢迎使用        下次再见                   ");
        System.out.println("*****************************************************");
    }
    public static void about(){
        System.out.println("************************关于**************************");
        System.out.println("             名称：    简易收银台                       ");
        System.out.println("             功能：    基于字符界面的收银系统             ");
        System.out.println("             作者：     dong                          ");
        System.out.println("             版本：     vx00001                       ");
        System.out.println("             反馈：     dong@24329737883              ");
        System.out.println("*****************************************************");

    }
    public static void buyInfo(){
        System.out.println("*******************买单功能***************************");
        System.out.println("    C  查看  X  下单   Q  取消  F  返回  L  浏览        ");
        System.out.println("           选择  C  X  Q  F  L  进行操作               ");
        System.out.println("*****************************************************");
    }
    public static void settingInfo(){
        System.out.println("********************设置功能***************************");
        System.out.println("    C  查看  X  下单   Q  取消  F  返回  R  修改         ");
        System.out.println("           选择  C  X  Q  F  R  进行操作                ");
        System.out.println("*****************************************************8");
    }
    public static void buy(){

    }
}















