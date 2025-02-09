class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, l = 0, h = 0;
        int[] occ = new int[95];
        while (h < s.length() && l <= h) {
            char i = s.charAt(h);
            while (l < h && occ[i - ' '] != 0) {
                char j = s.charAt(l);
                occ[j - ' '] = 0;
                l++;
            }
            occ[i - ' '] = 1;
            max = Math.max(max, h - l + 1);
            h++;
        }
        return max;
    }
}