/**
 * Author：TaiLong
 * created:2019/4/4
 */
enum sex {
    male("男"), female("女");
    private String title;

    private sex(String title) {
        this.title = title;
    }

    public String toString() {
      return  this.title ;
    }
}
class Person0{
   private String name;
   private int age;
  private  sex sex;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge() {
        return this.age;
    }
    public void setSex(sex sex){
        this.sex=sex;

    }
    public sex getSex(){
        return this.sex;
    }
    public   Person0(String name,int age,sex sex){
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    public String toString(){
        return "person"+this.getName()+this.getAge()+this.getSex();
    }
}

public class Enum1 {
    public static void main(String[] args){
        Person0 person=new Person0("王小娜",21,sex.female);
        System.out.println(person);
    }
}
