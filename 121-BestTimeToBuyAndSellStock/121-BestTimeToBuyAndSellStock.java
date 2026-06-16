// Last updated: 6/16/2026, 8:47:23 AM
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minbuy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minbuy=Math.min(minbuy,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minbuy);
        }
        return maxprofit;
    }
}