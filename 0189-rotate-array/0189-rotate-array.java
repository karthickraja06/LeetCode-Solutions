class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k != 0  && n > 1 && k%n != 0){
            int prev = nums[0], prevInd = 0, cur = 0,start = 0;
            for(int i = 0;i < n;i++){
                prevInd = (prevInd + k ) % n;
                cur = nums[prevInd];
                nums[prevInd] = prev;
                prev = cur;
                //to avoiding swaping in loop
                if(prevInd == start){
                    prev = nums[++prevInd];
                    start = prevInd;
                }
            }
        }
    }
}