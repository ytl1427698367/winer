package longjava;

import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/1/24
 */
abstract  class BrowCaffe{
     final void moth(){
        Browwarter();//1将水煮沸
        Brew();//2准备茶叶
        inputbrew();//3.将茶放入到煮沸的杯子中
        if (customer()){
            addsweet();
        }//4.加糖
    }
    boolean customer(){
        return true;
    }
    void Browwarter(){
        System.out.println("将水煮沸");
    }
   void addsweet(){
       System.out.println("加糖");
   }
 public  abstract void Brew();
    public abstract  void inputbrew();
}
class Caffe extends BrowCaffe{

    @Override
    public void Brew() {
        System.out.println("准备咖啡");
    }

    @Override
    public void inputbrew() {
        System.out.println("把咖啡加入到沸水中");
    }
    public boolean customer(){
        String anwer=getinfor();
        if(anwer.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }
    private String getinfor(){
        String anwer=null;
        System.out.println("请问你需要加糖吗？y or n ");
        Scanner scanner=new Scanner(System.in);
        anwer=scanner.nextLine();
        return anwer;
    }
}
class tea extends BrowCaffe{

    @Override
    public void Brew() {
        System.out.println("准备茶叶");
    }

    @Override
    public void inputbrew() {
        System.out.println("将茶叶放入到沸水中");
    }
}
public class Test74 {
    public static void main(String[] args) {
        BrowCaffe teas=new tea();
        BrowCaffe coffes=new Caffe();
        coffes.moth();
        //teas.moth();

    }

}
