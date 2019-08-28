package com.cong;
//大家都知道斐波那契数列，现在要求输入一个整数n，
// 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
public class Demo06 {
    public static void main(String[] args) {
        //1 1 2 3 5
        System.out.println(Fibonacci(6));
    }


    public static int Fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        //if (n==2) return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
