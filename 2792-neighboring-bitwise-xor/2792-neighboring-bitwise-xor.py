class Solution:
    def doesValidArrayExist(self, derived: List[int]) -> bool:
        zero = 0
        for i in derived:
            zero ^= i
        return True if zero == 0 else False