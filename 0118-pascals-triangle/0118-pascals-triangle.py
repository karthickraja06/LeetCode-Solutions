class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        a = [[1],[1,1]]
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return a
        else:
            for i in range(2,numRows):
                b = [1,1]
                for j in range(1,i):
                    b.insert(j,(a[i-1][j-1]+a[i-1][j]))
                a.append(b)
            return a
                

            