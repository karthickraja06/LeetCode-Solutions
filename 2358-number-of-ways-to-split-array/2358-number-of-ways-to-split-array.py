class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        total_sum = 0
        for i in nums:
            total_sum += i
        
        res = 0
        left_sum = 0
        for i in range(0,len(nums) - 1):
            left_sum += nums[i]
            if(left_sum >= (total_sum - left_sum)):
                res += 1
            
        return res