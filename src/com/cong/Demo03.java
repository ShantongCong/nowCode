package com.cong;
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
// 例如，当字符串为We Are Happy.
// 则经过替换之后的字符串为We%20Are%20Happy。
public class Demo03 {
    public static void main(String[] args) {
        StringBuffer string=new StringBuffer("We Are Happy");
        String s = replaceSpace(string);
        System.out.println("s = " + s);


    }
    public static String replaceSpace(StringBuffer str) {
        String string = str.toString();
        return string.replaceAll(" ", "%20");


    }
}
