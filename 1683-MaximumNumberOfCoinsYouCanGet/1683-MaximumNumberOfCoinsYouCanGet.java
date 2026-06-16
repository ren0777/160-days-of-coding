// Last updated: 6/16/2026, 8:45:57 AM
class Solution {
    public int maxCoins(int[] piles) {
       Arrays.sort(piles);
       int res =0,n=piles.length;
       for(int i=n/3;i<n;i+=2){
        res+=piles[i];
       }
       return res;
    }
}