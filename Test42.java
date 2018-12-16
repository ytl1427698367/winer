package lon.com;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author：TaiLong
 * created:2018/12/16
 */
//观察Queue的poll操作
public class Test42 {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList <>();
        System.out.println("队列是否为空" + queue.isEmpty());
        queue.add("hello");
        queue.add("java");
        queue.add("good");
        System.out.println("队列是否为空 " + queue.isEmpty());
        System.out.println("这个队列的长度为"+queue.size());
        System.out.println("第一个元素为 "+ queue.peek());
       // System.out.println(queue.poll());
      //  System.out.println(queue.poll());
        //System.out.println(queue.poll());
       // System.out.println(queue.poll());//取完数据，继续poll则返回null
        //用while循环输出
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        }

}