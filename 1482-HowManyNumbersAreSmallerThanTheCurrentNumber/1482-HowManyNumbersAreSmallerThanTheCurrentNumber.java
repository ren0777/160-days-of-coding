// Last updated: 6/16/2026, 8:46:06 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] sorted=nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],i);
            }
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}