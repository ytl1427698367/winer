/**
 * Author：TaiLong
 * created:2019/4/2
 */
interface  Imessage{
    String contradiction="我是多么的幸运遇到了你" ;
    public abstract void print();
}
interface  Pisson{
    public abstract String News();
}
class Double implements Imessage,Pisson{
   public void print(){
       System.out.println("王小娜，我喜欢你");
   }
   public String News(){
      return  "大概最美妙的事情就是和你在一起";

   }
}
abstract  class Distinct{
    abstract  void prints();
}
class diometer extends Distinct implements Imessage{
    public String getShow(){
        return "forever";
    }
    public void print(){
        System.out.println("i love you ");
    }
    public void prints(){
        System.out.println("you are my sunshine");
    }
}
public class InterfacePractise {
public static void main(String[] args){
    System.out.println(Imessage.contradiction);
    Imessage imessage =new Double();
    imessage.print();
    Pisson n=(Pisson)imessage;
    System.out.println(n.News());
    Imessage a=new diometer();
    a.print();

    ((diometer) a).prints();



}
}
