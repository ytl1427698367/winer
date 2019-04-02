import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/4/2
 */
interface Computer{
    public void compurterType();
}
class Xiaomi implements Computer{
    public void compurterType(){
        System.out.println("这是小米电脑");
    }
}
class Apples implements  Computer{
    public void compurterType(){
        System.out.println("这是苹果电脑");
    }
}
class simpleFactory{
    public static Computer getintance(String Type){
        Computer computer=null;
        if(Type.equals("xiaomi")){
            Computer computer1=new Xiaomi();
        }
        if (Type.equals("Apples")){
            Computer computer1=new Apples();
        }
        return computer;
    }
}

public class Test92 {
    public static void buycomputer(Computer computer){
        computer.compurterType();
    }
    public static void main(String[] args){
        Test92 test92=new Test92();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想要的电脑型号");
        String Type=scanner.nextLine();
Computer computer=simpleFactory.getintance(Type);
Test92.buycomputer(computer);
    }
}
