package com.cong;

import org.junit.Test;


public class Demo11 {


    //输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    // 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    // 前序遍历序列{1,2,4,7,3,5,6,8}
    // 中序遍历序列{4,7,2,1,5,3,8,6}，
    // 则重建二叉树并返回。
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //if (pre.length==0||)
        //只有特殊二叉树
        if (pre.length == 0) return null;
        if (pre.length == 1) return new TreeNode(pre[0]);
        if (pre.length == 2) {
            TreeNode treeNode = new TreeNode(pre[0]);

            if (in[1] == pre[0]) {
                treeNode.left = new TreeNode(in[0]);
            } else treeNode.right = new TreeNode(in[1]);
            return treeNode;

        }
        if (pre.length >= 3) {

            int rootKey = pre[0];
            TreeNode root = new TreeNode(rootKey);

            int len = -1;

            for (int i = 0; i < pre.length; i++) {
                if (pre[0] == in[i])
                    len = i;
            }

            if (len == 0) {
                return null;
            } else {

                int[] lp = new int[len];
                int[] li = new int[len];
                for (int i = 0; i < lp.length; i++) {
                    lp[i] = pre[i + 1];
                    li[i] = in[i];
                }
                root.left = reConstructBinaryTree(lp, li);

            }


            int rlen = pre.length - len - 1;

            if (rlen == 0) {
                return null;
            } else {
                int[] rp = new int[rlen];
                int[] ri = new int[rlen];
                for (int i = len; i < pre.length - 1; i++) {
                    rp[i - len] = pre[i + 1];
                    ri[i - len] = in[i + 1];
                }
                root.right = reConstructBinaryTree(rp, ri);
            }
            return root;
        }
        return null;
    }

    @Test
    public void test01() {
        int[] pre = {1, 2, 3, 4, 5};
        int[] in = {5, 4, 3, 2, 1};
        reConstructBinaryTree(pre, in);

    }


}
