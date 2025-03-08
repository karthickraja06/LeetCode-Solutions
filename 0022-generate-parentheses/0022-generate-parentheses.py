class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        
        def helper(openBal, closeBal, sb):
            if openBal == 0 and closeBal == 0:
                res.append("".join(sb))
                return
            
            if openBal > 0:
                sb.append('(')
                helper(openBal - 1, closeBal, sb)
                sb.pop()  # Backtrack
            
            if closeBal > openBal:
                sb.append(')')
                helper(openBal, closeBal - 1, sb)
                sb.pop()  # Backtrack
        
        helper(n, n, [])
        return res