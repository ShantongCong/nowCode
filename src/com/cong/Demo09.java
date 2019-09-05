package com.cong;

import org.junit.Test;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法
public class Demo09 {
    @Test
    public void test1(){

    }
    public int JumpFloorII(int target) {
        if (target==1) return 1;
        return JumpFloorII(target-1)*2;

    }
    @Test
    public void test02(){
        int i = Sum_Solution(5);
        System.out.println("i = " + i);


    }
    public int Sum_Solution(int n) {

            int sum = n;
            boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
            return sum;

        //return Sum_Solution(n-1)+n;
    }



}
