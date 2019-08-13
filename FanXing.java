package com.wate;

/**
 * Author：TaiLong
 * created:2019/7/31
 */
class Point<T>{
    private  T x;
    private  T y;
    public void setX(T x){
        this.x=x;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
class pok<y>{
    public void jk(y n){
        System.out.println(n);
    }
    public <i>  i ji1(i n){
        return n;
    }

}
public class FanXing {
    public static void main(String[] args){
        pok<String> bv=new pok <>();
        bv.jk("hello");
        Integer v=bv.ji1(23);
        Point<String> p= new Point<>();
        p.setX("10");
        p.setY("256");
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}




