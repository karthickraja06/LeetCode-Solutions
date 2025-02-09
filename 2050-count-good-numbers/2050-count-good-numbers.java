class Solution {
    static final int MOD = 1_000_000_007;

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // Positions at even indices (0-based)
        long oddCount = n / 2;         // Positions at odd indices (0-based)

        long evenWays = modPow(5, evenCount, MOD);  // 5 choices for even positions
        long oddWays = modPow(4, oddCount, MOD);    // 4 choices for odd positions

        return (int) ((evenWays * oddWays) % MOD);
    }
}
