// Last updated: 6/16/2026, 8:45:14 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;

        for(int num : nums){
            sum+=num;
        }
        return sum % k;
        
    }
}