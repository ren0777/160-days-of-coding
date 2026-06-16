// Last updated: 6/16/2026, 8:47:22 AM
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}