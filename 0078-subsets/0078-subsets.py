class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = []
        
        for i in range(1 << n):  # Iterate through 2^n subsets
            sub = []
            for j in range(n):
                if (i & (1 << j)) != 0:  # Check if j-th bit is set
                    sub.append(nums[j])
            res.append(sub)
        
        return res