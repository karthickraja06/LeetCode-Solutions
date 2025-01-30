class Solution:
    def trap(self, height: List[int]) -> int:
        l_max,r_max,total,l,r = 0,0,0,0,len(height) - 1
        while l < r:
            if height[l] <= height[r]:
                if(l_max > height[l]):
                    total += l_max - height[l]
                else:
                    l_max = height[l]
                l += 1 
            else:
                if(r_max > height[r]):
                    total += r_max - height[r]
                else:
                    r_max = height[r]
                r -= 1
        return total
