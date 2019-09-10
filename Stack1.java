package com.SortColection;

import java.util.Stack;

/**
 * Author：TaiLong
 * created:2019/9/9
 */
public class Stack1 {
    public static void main(String[] args){
        Stack<String> stack=new Stack <>();
        stack.push("hello");
        stack.push("java");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
