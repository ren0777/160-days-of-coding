// Last updated: 6/21/2026, 12:40:06 AM
// moore's voting algo
1class Solution {
2    public int majorityElement(int[] nums) {
3        int cnt=0;
4        int el=0;
5        for(int i=0;i<nums.length;i++){
6            if(cnt==0){
7                cnt=1;
8                el=nums[i];
9            }
10            else if(nums[i] == el){
11                cnt++;
12            }
13            else{
14                cnt--;
15            }
16        }
17        int cnt1=0;
18        for(int i=0;i<nums.length;i++){
19            if(nums[i] == el) cnt1++;
20        }
21        if(cnt1>(nums.length/2)){
22            return el;
23        }
24        return -1;
25    }
26}