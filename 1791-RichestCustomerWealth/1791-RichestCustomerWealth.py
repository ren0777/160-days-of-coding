# Last updated: 6/16/2026, 8:45:54 AM
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maxi=-1
        for i in accounts:
            x=sum(i)
            if x>maxi:
                maxi=x

        return maxi