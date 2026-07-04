// Last updated: 7/4/2026, 10:55:16 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap <Integer, Integer> sum=new HashMap<>();

    sum.put(0,1);

    int currentSum=0;
    int count=0;    
    
    for(int num : nums){
        currentSum+=num;

        if(sum.containsKey(currentSum-k)){
            count+=sum.get(currentSum-k);
        }
        
        sum.put(currentSum,sum.getOrDefault(currentSum,0)+1);
    }
    return count;
  }
}