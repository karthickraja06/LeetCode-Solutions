class Solution {
    public boolean divideArray(int[] nums) {
        int xorSum = 0,cnt = 0,lastNum = nums[nums.length - 1];
        for(int i : nums){
            xorSum ^= i;
            if(i == lastNum)
                cnt++;
        }
        return(xorSum == 0 && cnt % 2 == 0);
    }
}