package lon.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Author：TaiLong
 * created:2018/12/25
 */
public class Test47 {
    public static void main(String[] args) {
        List <String> list = new ArrayList <String>();
        Collections.addAll(list, "java", "C++", "C语言");
        list.forEach(s -> System.out.println(s));
        System.out.println(list.stream().count());
        list.stream().filter(s -> s.contains("java")).forEach(System.out::println);
        list.stream().skip(1).limit(3).filter(s->s.contains("C++")).forEach(System.out::println);
    }

}
