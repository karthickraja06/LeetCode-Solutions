class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,cur = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1) cur++;
            else if(cur > max) {
                max = cur;
            }
            if(nums[i] == 0)cur = 0;
        }
        if(cur > max) max = cur;
        return max;
    }
}