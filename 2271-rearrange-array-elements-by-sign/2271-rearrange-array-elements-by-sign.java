class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1;
        int[] res = new int[nums.length];
        for(int i: nums){
            if(i < 0){
                res[neg] = i;
                neg += 2;
            }else{
                res[pos] = i;
                pos += 2;
            }
        }
        return res;
    }
}