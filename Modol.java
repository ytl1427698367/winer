import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/3/28
 */
abstract class Dreak{
final void Celection() {
    prepare();//准备工作
    boilwater();//把水煮沸
    brew();
    if (customerwantto()) {
        Input();//是否加糖
    }
}
   boolean customerwantto(){
       return true;
    }
        void prepare(){
            System.out.println("准备好烧水电器");
}
void boilwater(){
    System.out.println("将水煮沸");
}
abstract  void Input();
abstract  void brew();
}

class tea extends Dreak{
   public void Input(){
        System.out.println("把糖加入水中");
    }
    public void brew(){
        System.out.println("将茶叶放入水中");
    }

    @Override
    public boolean customerwantto() {
        String anwer = getinfor();
        if (anwer.equals("y")) {
            System.out.println("加糖");
            return true;
        } else {
            System.out.println("不加糖"+"\n"+"\n");
            return false;
        }
    }
    String getinfor(){
       String anwer=null;
        System.out.println("请问你想在茶中加入糖吗？");
        Scanner scanner=new Scanner(System.in);
        anwer=scanner.nextLine();
        return anwer;
    }
}
class Apple extends Dreak{
    public void brew(){
        System.out.println("把苹果汁放入杯中");
    }
    public void Input(){
        System.out.println("不加糖");
    }
}
public class Modol {
    public static void main(String[] args) {
        Dreak dreak=new tea() ;
            Dreak dreak1=new Apple();
            dreak.Celection();
            dreak1.Celection();
        }
}
