class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        xorSum,cnt,lastNum = 0,0,nums[len(nums) - 1]
        for i in nums:
            xorSum ^= i
            if(i == lastNum):
                cnt += 1
        return (xorSum == 0 and cnt % 2 == 0) 
