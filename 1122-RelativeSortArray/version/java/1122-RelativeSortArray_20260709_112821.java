// Last updated: 7/9/2026, 11:28:21 AM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int leftSum=0;
4        int n=cardPoints.length;
5        for(int i=0;i<k;i++){
6            leftSum+=cardPoints[i];
7        }
8        int rightSum=0;
9        int maxSum=leftSum;
10        for(int i=0;i<k;i++){
11            leftSum-=cardPoints[k-1-i];
12            rightSum+=cardPoints[n-1-i];
13            maxSum=Math.max(maxSum,leftSum+rightSum);
14        }
15        return maxSum;
16    }
17}