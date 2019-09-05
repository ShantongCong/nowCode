package com.cong;

import org.junit.Test;
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//1.若干个：至少一个
//2.考虑存在相等的问题
//3.放数组只有一/两个数
//输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
//NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

public class Demo08 {
    @Test
    public void test1(){
        int[] arr={3,4,5,1,2};
        //int[] arr1={2,4,5,1,2};
        int[] arr2={4,4,5,1,1};
        int[] arr3={1,1,1,1,1};
        //System.out.println(arr.length);
        //System.out.println(minNumberInRotateArray(arr));
        System.out.println(min(arr3));

    }
    public static int minNumberInRotateArray(int [] array) {
        if (array.length==0) {
            return 0;
        }
        int min=array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=min)
                min=array[i];
        }
        return min;

    }
    public static int min(int[] array){
        if (array.length==0)  return 0;//如果数组为空
        if(array.length==1) return array[0];//如果数组长度为1
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1])
                return array[i+1];//非递减=递增+相等=最小的数在最前面
            //一旦把前面的数往后移，就会存在滑坡处，滑坡处就在min
        }
        return array[0];//如果数组全部相等
    }


}
