/**
 * Author：TaiLong
 * created:2019/4/4
 */
interface  Imath{
    public void add(int x,int y);
}
interface  Message{
    public void print();
}
public class LambdaPractise {
    public static void main(String[] args){
        Imath imath=(p1,p2)-> System.out.println(p1+p2);
        Message message= ()->{
            System.out.println("王小娜，我喜欢你");
            System.out.println("爱你么么哒");

        }  ;
        imath.add(21,25);
        message.print();
    }
}
