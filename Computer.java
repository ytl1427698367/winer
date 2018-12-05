/**
 * Author：TaiLong
 * created:2018/12/4
 */
public class Computer {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {

            System.out.println("请输入mac，Mi和Shine类型的电脑,输入k退出");
            String type = scanner.nextLine();
            {
                if (type.equals("k")) {
                    break;
                }
            }
            computer computers = SimpleFactory.getinstance(type);
            if (computers == null) {
                System.out.println("输入的类型" + type + "不支持");
            } else {
                Client.buy(computers);
            }
            // Client client=new Client();
            // client.buy(SimpleFactory.getinstance("Mi"));
        }
    }
}
//设计一个简单的工厂
class SimpleFactory{
    public static computer getinstance(String type){
        computer computers=null;
        switch(type){
            case "mac":
                computers=new MacbookComputer();
                break;
            case "mi":
                computers=new Micomputer();
                break;
            case "shi":
                computers=new ShineComputer();
                break;
            default:
                System.out.println("不存在这种类型的电脑");

        }

        return computers;
    }
}
interface computer{//设计一个接口

     void printcomputer();
}
class Client{
    public static void buy(computer computers){
        computers.printcomputer();

    }
}
class MacbookComputer implements computer{
            public void printcomputer() {
        System.out.println("这是一台Macbookcomputer电脑");
    }
        }
class Micomputer implements computer{
    public void printcomputer() {
        System.out.println("这是一台Micomputer电脑");
    }
}
class ShineComputer implements computer{
    public void printcomputer() {
        System.out.println("这是一台Shinecomputer电脑");
    }
}
