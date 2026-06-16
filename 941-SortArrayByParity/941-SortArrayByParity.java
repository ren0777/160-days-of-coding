// Last updated: 6/16/2026, 8:46:20 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
            return nums;
    }
}