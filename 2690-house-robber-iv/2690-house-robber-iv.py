class Solution:
    def isPossible(self, nums, k, cap):
        cnt = 0
        i = 0
        while i < len(nums):
            if nums[i] <= cap:
                cnt += 1  # Rob this house
                i += 1  # Skip the next house
            i += 1  # Move to next house
        return cnt >= k

    def minCapability(self, nums: List[int], k: int) -> int:
        l, r = min(nums), max(nums)

        while l <= r:
            mid = (l + r) // 2
            if self.isPossible(nums, k, mid):
                r = mid - 1
            else:
                l = mid + 1
        return l