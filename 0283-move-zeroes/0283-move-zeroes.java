class Solution {
    public void moveZeroes(int[] nums) {
        // int n = nums.length-1;
        int c = 0;
        if(nums.length > 1){
            for(int i = 0;i<nums.length;i++){
                if(nums[i] != 0){
                    nums[c++] = nums[i];
                }
            }
            for(int i = c--;i<nums.length;i++){
                nums[i] = 0;
            }
        }
    }
}