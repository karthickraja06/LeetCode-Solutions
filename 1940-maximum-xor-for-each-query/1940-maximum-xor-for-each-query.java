class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length; 
        int[] res = new int[n];
        int maxOnes = (int)Math.pow(2,maximumBit) - 1;
        int sumXor = nums[0];
        for(int i = 1;i < n;i++){
            res[n-i] = sumXor ^ maxOnes;
            sumXor ^= nums[i];
        }

        res[0] = sumXor ^ maxOnes;
        return res;
    }
}