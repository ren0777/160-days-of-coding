// Last updated: 6/29/2026, 1:26:00 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxProfit=0;
4        int minbuy=Integer.MAX_VALUE;
5
6        for(int i=0;i<prices.length;i++){
7            minbuy=Math.min(minbuy,prices[i]);
8            maxProfit=Math.max(maxProfit,prices[i]-minbuy);
9        }
10        return maxProfit;
11    }
12}