class Solution:
    def isPossible(self, candies, k, candy):
        child = sum(i // candy for i in candies)  # Count children served
        return child >= k
    def maximumCandies(self, candies: List[int], k: int) -> int:
        total_sum = sum(candies)
        max_candy = max(candies)

        if total_sum < k:
            return 0
        if total_sum == k:
            return 1

        l, r = 1, max_candy
        while l <= r:
            mid = (l + r) // 2
            if self.isPossible(candies, k, mid):
                l = mid + 1
            else:
                r = mid - 1

        return r