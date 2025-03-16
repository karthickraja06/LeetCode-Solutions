class Solution:
    def isPossible(self, ranks, cars, min_time):
        cnt = 0
        for r in ranks:
            cnt += int(math.sqrt(min_time / r))  # Number of cars mechanic can repair
            if cnt >= cars:
                return True
        return False
        
    def repairCars(self, ranks: List[int], cars: int) -> int:
        n = len(ranks)
        c = math.ceil(cars / n) ** 2

        l = min(ranks) * c  # Minimum possible time
        r = max(ranks) * c  # Maximum possible time

        while l <= r:
            mid = (l + r) // 2
            if self.isPossible(ranks, cars, mid):
                r = mid - 1  # Try to minimize time
            else:
                l = mid + 1  # Increase time
        return l