class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = nums[0],sum = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i - 1] < nums[i]){
                sum += nums[i];
            }else{
                res = Math.max(res,sum);
                sum = nums[i];
            }
        }
        return Math.max(res,sum);
    }
}