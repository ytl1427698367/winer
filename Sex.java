package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
    enum  Sexs{
        Man("男"),Woman("女");
        private String title;
        private Sexs(String title){
            this.title=title;
        }

    @Override
    public String toString() {
        return this.title;
    }
}
class Persons{
        private int age;
        private Sexs sef;
        private String name;

    public  Persons(int age,Sexs se,String name){

super();
            this.age=age;
            this.name=name;
            this.sef=se;
        }

    @Override
    public String toString() {

        return "Persons{" +
                "age=" + age +
                ", sef=" + sef +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Sex {
public static void main(String[] args){
    Persons persons=new Persons(12,Sexs.Man,"杨泰隆");
    System.out.println(persons);
}
}
