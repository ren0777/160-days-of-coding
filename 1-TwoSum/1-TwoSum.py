# Last updated: 6/16/2026, 8:48:28 AM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        for i in range(len(nums)):
            if target - nums[i] not in d:
                d[nums[i]]=i
            else:
                return[d[target-nums[i]],i]