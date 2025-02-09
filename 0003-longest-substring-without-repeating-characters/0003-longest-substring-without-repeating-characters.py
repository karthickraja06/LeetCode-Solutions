class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set = set()
        max_length = 0
        l = 0  # Left pointer
        
        for h in range(len(s)):  # Right pointer
            while s[h] in char_set:
                char_set.remove(s[l])
                l += 1  # Shrink window from left
            
            char_set.add(s[h])  # Add current char to set
            max_length = max(max_length, h - l + 1)
        
        return max_length
