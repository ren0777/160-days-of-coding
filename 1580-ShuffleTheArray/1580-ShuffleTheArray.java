// Last updated: 6/16/2026, 8:46:02 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        for(int i=0;i<n;i+=1){
            arr[2*i]=nums[i];
            arr[2*i+1]=nums[i+n];
        }
        return arr;
    }
}