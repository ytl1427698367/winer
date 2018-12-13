package lon.com;

import java.util.*;

/**
 * Author：TaiLong
 * created:2018/12/12
 */
//观察HasSet和和treeSet的使用
class Hashs {
    void Hash() {
        Set <String> set = new HashSet <>();
        set.add("hello");
        set.add("hello");//重复元素，但只显示一个
        set.add(" Java");
        set.add("love");
        set.add("开");
        System.out.println(set);
    }

}
//treeset 可以进行排序
class Trees {
    void Tree() {
        Set <String> set = new TreeSet <>();
        set.add("D");
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
    }

}
public class Test38 {
    public static void main(String[] args) {
        Hashs Hashss=new Hashs();
        Hashss.Hash();
        Trees Treess=new Trees();
        Treess.Tree();

    }
}
