class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for(int i:nums){
            totalSum += (long)i;
        }
        int res = 0;
        long leftSum = 0;
        for(int i = 0;i < nums.length - 1;i++){
            leftSum += nums[i];
            if(leftSum >= (totalSum - leftSum)) res++;
        }
        return res;
    }
}