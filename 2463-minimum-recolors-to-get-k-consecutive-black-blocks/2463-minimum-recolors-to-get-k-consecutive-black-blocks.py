class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        res = float('inf')
        n = blocks[:k].count('W')
        res = min(res, n)
        
        for i in range(k, len(blocks)):
            n -= (blocks[i - k] == 'W')
            n += (blocks[i] == 'W')
            res = min(res, n)
        
        return res
