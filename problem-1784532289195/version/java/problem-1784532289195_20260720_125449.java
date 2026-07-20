// Last updated: 7/20/2026, 12:54:49 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int maxDaimeter=0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        getHeight(root);
20        return maxDaimeter;
21    }
22    private int getHeight(TreeNode node){
23        if(node==null){
24            return 0;
25        }
26
27        int leftHeight=getHeight(node.left);
28        int rightHeight=getHeight(node.right);
29
30        maxDaimeter= Math.max(maxDaimeter,leftHeight+rightHeight);
31
32        return 1+Math.max(leftHeight,rightHeight);
33    }
34}