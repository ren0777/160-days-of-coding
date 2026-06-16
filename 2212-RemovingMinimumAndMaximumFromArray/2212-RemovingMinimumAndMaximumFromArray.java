// Last updated: 6/16/2026, 8:45:42 AM
class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0;
        int min=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]) max=i;
            if(nums[i]<nums[min]) min=i;
        }
        if(min>max){
            int temp=max;
            max=min;
            min=temp;
        }
        int removeFromFront=max+1;
        int removeFromBack=n-min;

        int removeFromBoth=(min + 1) + (n - max);



        return Math.min(removeFromFront, Math.min(removeFromBack, removeFromBoth));
    }
}