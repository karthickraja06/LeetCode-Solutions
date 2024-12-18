class Solution {
    public int jump(int[] nums) {
        int jumps = 0,l = 0,r = 0;
        while(r < nums.length - 1){
            int maxSteps = 0;
            for(int i = l;i <= r;i++){
                maxSteps = Math.max(maxSteps,i+nums[i]);
            }
            l = r+1;r = maxSteps;jumps++;
        }
        return jumps;
    }
}