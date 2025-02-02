class Solution:
    def frequencySort(self, s: str) -> str:
        # Step 1: Count the frequency of each character
        freq = {}
        for char in s:
            freq[char] = freq.get(char, 0) + 1
        
        # Step 2: Sort characters by frequency (descending) and lexicographical order (ascending)
        sorted_chars = sorted(freq.items(), key=lambda x: (-x[1], x[0]))
        
        # Step 3: Construct the result string
        result = []
        for char, count in sorted_chars:
            result.append(char * count)
        
        return "".join(result)
