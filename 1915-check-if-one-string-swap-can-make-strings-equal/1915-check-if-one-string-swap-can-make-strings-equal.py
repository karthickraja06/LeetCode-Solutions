class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        ind, cnt = -1, 0
        for i in range(len(s1)):
            if s1[i] != s2[i]:
                cnt += 1
                if ind == -1:
                    ind = i
                elif cnt > 2 or s1[ind] != s2[i] or s1[i] != s2[ind]:
                    return False
        return cnt != 1