import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/3/27
 */
class dad{
    private int age;
    public String name;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void print(String name,int age){
        name=name;
        setAge(age);
        System.out.println("姓名:"+name+"\n"+"年龄:"+this.getAge());
    }
}
class Chilren extends  dad{
    private String birthday;
    public void setBirthday(String birthday){
        this.birthday=birthday;
    }
    public String getBirthday(){
        return this.birthday;
    }
    public void fun(String name,int age,String birthday){
setBirthday(birthday);
            System.out.println("name:"+name+"\n"+"age:"+this.getAge()+"\n"+"birthday:"+this.getBirthday());
        }
}
public class Extends{
    public static void main(String[] args) {

 dad dads=new Chilren();
 dads.print("杨泰隆",21);
 Chilren chilren=(Chilren) dads;
 chilren.fun("王小娜",21,"1998-1-13");
        System.out.println("爱你哟，么么哒");

    }

}