// Last updated: 7/21/2026, 1:04:19 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> result=new ArrayList<Integer>();
19        rightView(root,result,0);
20        return result;
21    }
22
23    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
24        if(curr==null){
25            return;
26        }
27        if(currDepth == result.size()){
28            result.add(curr.val);
29
30        }
31        rightView(curr.right,result,currDepth+1);
32        rightView(curr.left,result,currDepth+1);
33    }
34}