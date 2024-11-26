class Solution {
    public int maxProduct(int[] nums) {
        int pref = 1,suf = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(pref == 0)pref = 1;
            if(suf == 0)suf = 1;
            pref *= nums[i];
            suf *= nums[nums.length - i -1];
            maxi = Math.max(maxi,Math.max(pref,suf));
        }
        return maxi;
    }
}