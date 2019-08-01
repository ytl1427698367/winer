package com.ming;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
class person1 implements Comparable<person1> {
    private Integer price;
    private String brand;

    @Override
    public String toString() {
        return "person1{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(person1 o) {
       if(this.brand==o.brand){
           return 1;
       }
       else if(this.brand!=o.brand){
           return -1;
           }
           else{
          return this.price.compareTo(o.price);
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof person1)) return false;
        person1 person1 = (person1) o;
        return getPrice() == person1.getPrice() &&
                Objects.equals(getBrand(), person1.getBrand());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPrice(), getBrand());
    }

    public person1(int price, String brand){
        this.brand=brand;
        this.price=price;
}


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class Compare1 {
    public static void main(String[] args){
        Set<person1> person1s=new TreeSet<>();
        person1s.add(new person1(225555,"宝马"));
        person1s.add(new person1(89641613,"霸道"));
        person1s.add(new person1(48613,"保时捷"));
        person1s.add(new person1(225555,"宝马"));
        System.out.println(person1s);
    }
}
