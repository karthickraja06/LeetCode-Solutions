class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # dic = {}
        for i in range(len(nums)):
            comp = target - nums[i]
            if comp in nums and i != nums.index(comp):
                return [i,nums.index(comp)]
            # dic[comp] = i
                
        
            