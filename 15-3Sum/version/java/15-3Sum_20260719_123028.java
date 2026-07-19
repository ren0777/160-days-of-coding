// Last updated: 7/19/2026, 12:30:28 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4
5        List<List<Integer>> ans=new ArrayList<>();
6
7        for(int i=0;i<nums.length-2;i++){
8
9            if(i>0 && nums[i] == nums[i-1]) continue;
10
11            int left=i+1;
12            int right=nums.length-1;
13
14            while(left<right){
15                int sum=nums[i]+ nums[left]+nums[right];
16
17                if(sum==0){
18                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
19                    while(left < right && nums[left] == nums[left+1]) left++;
20
21                    
22
23                    while(left<right &&  nums[left] == nums[right-1]) right--;
24
25                    left++;
26                    right--;
27                }
28                else if(sum < 0) left++;
29                else right--;
30            }
31        }
32        return ans;
33    }
34}