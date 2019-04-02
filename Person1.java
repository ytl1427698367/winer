/**
 * Author：TaiLong
 * created:2019/3/27
 */


 class Person12 {
    private int age;
    private String name;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(int i){
        return this.age;
    }
    public void setName(String nam){
        this.name=nam;
    }
    public String getName(String 王小娜){
        return this.name;
    }
    public void Person12(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void print(){
        System.out.println("姓名"+this.name+"年龄"+this.age);
    }
 }
public class Person1{
        public static void main(String[] args) {
Person12 person1=new Person12();
person1.setAge(21);
person1.setName("王小娜");
person1.print();
    }
    }
