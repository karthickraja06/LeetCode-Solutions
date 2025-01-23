class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge cases for overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Clamp to 2^31 - 1
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE; // Clamp to -2^31
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0); // XOR: true if signs differ

        // Convert dividend and divisor to positive values
        long absDividend = Math.abs((long) dividend); // Use long to handle edge cases
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        // Perform division using bit manipulation
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;

            // Double the divisor until it exceeds the remaining dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest shifted divisor and add the corresponding multiple
            absDividend -= tempDivisor;
            result += multiple;
        }

        // Apply the sign to the result
        return isNegative ? -result : result;
    }
}
