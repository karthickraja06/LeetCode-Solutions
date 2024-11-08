class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length,maxOnes = (int)Math.pow(2,maximumBit) - 1,sumXor = 0; 
        int[] res = new int[n];
        for(int i = 0;i < n;i++){
            sumXor ^= nums[i];  
            res[n-(i+1)] = sumXor ^ maxOnes;
        }
        return res;
    }
}