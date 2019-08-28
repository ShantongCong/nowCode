package com.cong;

public class Demo02 {
    public static void main(String[] args) {
        //在一个二维数组中（每个一维数组的长度相同），
        // 每一行都按照从左到右递增的顺序排序，
        // 每一列都按照从上到下递增的顺序排序。请完成一个函数，
        // 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
        //int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //int[][] a1={};
        int[][] a2={{}};

        boolean find = Find(5, a2);
        System.out.println("a2.length = " + find);
        //System.out.println("find = " + a2[0].length);

    }

        public static boolean Find(int target, int [][] array) {
            if (array[0].length==0) return false;
            for (int i = 0; i < array.length; i++) {
                for (int i1 = 0; i1 < array.length; i1++) {
                    if (target==array[i1][i])
                        return true;
                }
            }
        return false;
        }
}
