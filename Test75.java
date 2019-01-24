package longjava;

/**
 * Author：TaiLong
 * created:2019/1/24
 */
interface  Imessage{
    public static final String mes="Hello 凯皇" ;
    public abstract  void print();
}
interface  Imess4{
    public abstract  String getnews();
}
class mess implements Imessage,Imess4{

    @Override
    public void print() {
        System.out.println(Imessage.mes);
    }

    @Override
    public String getnews() {
        return Imessage.mes;
    }
}
public class Test75 {
    public static void main(String[] args) {
        Imessage imessage=new mess();
        imessage.print();
        Imess4 n=(Imess4)imessage;
        System.out.println(n.getnews());
    }
}
