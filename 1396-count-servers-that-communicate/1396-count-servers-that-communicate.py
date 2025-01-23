class Solution:
    def countServers(self, grid: List[List[int]]) -> int:
        res = 0
        for i in range(len(grid)):
            sub = 0
            ind = -1
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    sub += 1
                    ind = j
            if sub > 1:
                res += sub
            elif ind != -1:
                for k in range(len(grid)):
                    if k != i and grid[k][ind] == 1:
                        res += 1
                        break
        return res