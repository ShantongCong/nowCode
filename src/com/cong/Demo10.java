package com.cong;

import org.junit.Test;

public class Demo10 {
    @Test
    public void test1() {
        char[] chars = {'a', 'c', 'c', 'D', 'E', 'F'};
        for (char cha : chars) {

            if (cha >= 'A' && cha <= 'Z') {
                System.out.println((char) (cha | 32));//cha+32
            } else if (cha >= 'a' && cha <= 'z') {
                System.out.println((char) (cha & (cha - 32)));//char-32
            }
        }
        //char cha='a';


        //System.out.println(3&5);
        //System.out.println(-3&-5);

        //System.out.println(NumberOf1(1234));
        //System.out.println(NumberOf1(-123));
    }

    @Test
    public void test2() {
        System.out.println(95 | 16);

    }

    @Test
    public void test03() {
        int a = 52;
        int b = 64;
        System.out.println(a ^ b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
    @Test
    public void test04(){

    }


    public int NumberOf1(int n) {
        int count = 0;
        String string = Integer.toBinaryString(n);
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (aChar == '1')
                count++;
        }
        return count;

    }
}
