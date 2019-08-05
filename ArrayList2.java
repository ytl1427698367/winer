package com.ming;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
class Person {
    private int age;
    private String name;
    private String sex;

    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
public class ArrayList2 {
    public static void main(String[] args){
        List<Person> personList=new ArrayList <>();
        personList.add(new Person(21,"杨泰隆","男"));
        personList.add(new Person(21,"王小娜","女"));
        personList.add(new Person(0,"小小那","女"));
        personList.add(new Person(21,"小小隆","男"));
        personList.remove(new Person(21,"小小隆","男"));
        personList.contains(new Person(25,"小小隆","男"));
        System.out.println(personList);
    }
}
