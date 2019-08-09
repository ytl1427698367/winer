package com.ming;

import java.util.Stack;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
public class Stack1 {
    public static void main(String[] args){
        Stack<String> stack=new Stack <>();

        stack.push("A");
        stack.push("B");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
