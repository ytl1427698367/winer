package com.ming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class Animal{
    private String name;
    private Integer age;
    private char Sysbol;
    public Animal(String name,Integer age,char Sysbol){
        this.age=age;
        this.name=name;
        this.Sysbol=Sysbol;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Sysbol=" + Sysbol +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSysbol() {
        return Sysbol;
    }

    public void setSysbol(char sysbol) {
        Sysbol = sysbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Sysbol == animal.Sysbol &&
                Objects.equals(name, animal.name) &&
                Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, Sysbol);
    }
}
public class Iterator1 {
    public static void main(String[] args){
        Set<Animal> Animal1=new HashSet <>();
        Animal1.add(new Animal("cat",3,'A'));
        Animal1.add(new Animal("dog",4,'B'));
        Animal1.add(new Animal("pag",3,'C'));
        Animal1.add(new Animal("cat",3,'A'));
        Animal1.remove(new Animal("pag",3,'C'));
        Animal1.contains(new Animal("targer",3,'A'));
        Iterator<Animal> iterator=Animal1.iterator();
        while(iterator.hasNext()){
            Animal str=iterator.next();
            System.out.println(str);


        }






    }
}
