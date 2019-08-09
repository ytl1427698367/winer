package com.ming;

import java.lang.reflect.Method;

/**
 * Author：TaiLong
 * created:2019/8/5
 */
class grilfriend{
    private int age;
    private String name;
    private String out;
    public void grilfrienf(int age,String name,String out){
        this.age=age;
        this.name=name;
        this.out=out;
    }

    @Override
    public String toString() {
        return "grilfriend{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", out='" + out + '\'' +
                '}';
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

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
public class fanshe2
{
    public static void main(String[] args)throws Exception{
        Class<?> cl=grilfriend.class;
        Method[] method=cl.getMethods();
        for (Method methods : method)
        { System.out.println(methods); }


    }
}
