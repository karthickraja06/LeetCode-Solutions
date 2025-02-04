class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        res, summ = nums[0], nums[0]
        for i in range(1, len(nums)):
            if nums[i - 1] < nums[i]:
                summ += nums[i]
            else:
                res = max(res, summ)
                summ = nums[i]
        return max(res, summ)