class Solution {
    public boolean check(int[] nums) {
        if(nums.length <3) return true;
        int c = 0, j = nums.length - 1, max = nums[nums.length -1];
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] > nums[i+1]){
                c++;
                j = i;
            }
        }
        if(c <= 1 && max == nums[j]){
            return true;
        }
        return false;
    }
}