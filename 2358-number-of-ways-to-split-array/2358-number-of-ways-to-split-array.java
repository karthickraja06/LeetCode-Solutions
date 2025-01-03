class Solution {
    public int waysToSplitArray(int[] nums) {
        List<Long> prefixSum = new ArrayList<>();
        long totalSum = 0;
        for(int i:nums){
            totalSum += (long)i;
            prefixSum.add(totalSum);
        }
        int n = nums.length;
        int res = 0;
        for(int i = 0;i < n - 1;i++){
            long leftSum = prefixSum.get(i);
            if(leftSum >= (totalSum - leftSum)) res++;
        }
        return res;
    }
}