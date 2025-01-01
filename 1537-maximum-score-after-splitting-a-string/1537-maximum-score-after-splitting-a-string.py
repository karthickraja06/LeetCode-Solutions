class Solution:
    def maxScore(self, s: str) -> int:
        zeros = 0
        ones = 0
        res = -1
        for i in s:
            if i == '1':
                ones += 1
        
        for i in range(0,len(s) - 1):
            if s[i] == '0':
                zeros += 1
            else:
                ones -= 1
            res = max(res, ones + zeros)
        return res