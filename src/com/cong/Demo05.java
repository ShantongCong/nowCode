package com.cong;

import org.junit.Test;

import java.util.Stack;
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class Demo05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    @Test
    public void test1(){

        push(5);
        push(4);
        System.out.println(pop());//5
        push(3);
        push(2);
        System.out.println(pop());//4
        System.out.println(pop());//3
        System.out.println(pop());//2


    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()){
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        Integer pop = stack2.pop();
        while (!stack2.empty()){
            Integer pop1 = stack2.pop();
            stack1.push(pop1);
        }
        return pop;
    }
}
