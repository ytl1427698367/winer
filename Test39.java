package lon.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author：TaiLong
 * created:2018/12/13
 */
public class Test39 {

    public static void main(String[] args) {
        Map <String, String> map = new HashMap();
        map.put("1", "java");
        map.put("2", "hello");
        map.put("3","loveyou ");
        System.out.println(map.containsKey("1"));
        System.out.println(map.get("1"));
        Set<String> set = map.keySet() ;
        Iterator <String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()) ;
        }

    }
}
