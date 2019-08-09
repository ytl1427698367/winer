package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/5
 */
interface IFrult {
};

interface IMessege {
};

class ClS implements IFrult, IMessege {
}

public class Fanshe {
    public static void main(String[] args) {
        Class <?> clas = ClS.class;//取得class类对象。
        System.out.println(clas.getPackage().getName());//取得package包名称
        System.out.println(clas.getSuperclass().getName());//取得父类对象的名称
// 取得实现的父接口对象
        Class <?>[] iClass = clas.getInterfaces();
        for (Class <?> class1 : iClass) {
            System.out.println(class1.getName());
        }


    }
}
