package lon.com;
import java.util.*;
/**
 * Author：TaiLong
 * created:2018/12/16
 */
//Hashtable是最早实现这种二元偶对象数据结
//构，后期的设计也让其与Vector一样多实现了Map接口而已。
//范例：观察Hashtable,并比较Hashmap与Hashtable的区别
public class Test40 {
    public static void main(String[] args) {
        //线程不安全但高效，异步处理
        Map <String, String> map = new Hashtable <>();
        //线程安全但性能较低,同步处理
        Map <String, String> map1 = Collections.synchronizedMap(new HashMap <>());
        map.put("1", "hello");
        map.put("2", "java");
        map.put("3", "study");
        System.out.println(map);
    }
}
