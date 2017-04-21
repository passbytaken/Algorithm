package me.ele.napos.datastruct;

import java.util.Stack;

/**
 * Created by jakoo on 20/04/2017.
 */
public class StackDemo {

    public static void showpush(Stack stack, int a) {
        stack.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
    }

    public static void showpop(Stack stack) {
        System.out.println("pop -> ");
        Integer a = (Integer) stack.pop();
        System.out.println(a);
        System.out.println("stack: " + stack);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack: " + stack);

        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        showpop(stack);
        showpop(stack);
        showpop(stack);

        showpop(stack);
    }
}
