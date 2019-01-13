package longjava;

/**
 * Author：TaiLong
 * created:2019/1/13
 */
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String mn) {
        this.name = mn;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        this.apple();
    }
public void Person(String name,int age){
        this.name=name;
        this.age=age;

}
public void apple(){
        System.out.println("送你一个好吃的苹果");
}

    public void print() {
        System.out.println("姓名" + this.name + "年龄" + this.age);
    }
}

public class Test63 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(25);
        person.print();


    }
}

