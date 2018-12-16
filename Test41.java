package lon.com;
import java.util.Stack;

/**
 * Author：TaiLong
 * created:2018/12/16
 */
//stack栈，先进后出原则
public class Test41 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        System.out.println("栈是否为空" +stack.isEmpty());
        stack.push("hello");//第一个元素，最后一个输出
        stack.push("Java");//第二个元素
        stack.push("top");//末元素，第一个输出
        System.out.println("栈是否为空" +stack.isEmpty());
        System.out.println(stack.peek());
        //输出栈顶元素
        //这里用while循环，如果不为空，则输出，也可以一个个输出
        while (!stack.isEmpty()){
            System.out.println(stack.pop());}
    }
}
