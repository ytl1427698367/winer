package longjava;

/**
 * Author：TaiLong
 * created:2019/1/13
 */
class Person2{
    private String name;
    private int age;
    static String country;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String c) {
        this.country=c;
}
public String print(){
        return "国家是："+this.country+"姓名"+this.name+"年龄"+this.age;
}
}


public class Test64 {
    public static void main(String[] args){
        Person2.country="中国";
        Person2 person=new Person2();
        person.setAge(22);
        person.setName("小明");

        System.out.println(person.print());

    }
}
