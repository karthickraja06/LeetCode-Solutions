class Solution {
    public int reverse(int x) {
        long n = 0;  // Use long to handle overflow
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
            // Check for overflow
            if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) n;  
    }
}
