class Solution {
    public boolean isPossible(int[] nums,int k,int cap){
        int cnt = 0,i = 0;
        while(i < nums.length){
            if(nums[i] <= cap){
                cnt++;
                i++;
            }
            i++;
        }
        if(cnt >= k)
            return true;
        return false;
    }
    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE,r = 0;
        for(int i:nums){
            r = Math.max(r,i);
            l = Math.min(l,i);
        }
        while(l <= r){
            int mid = (l + r) / 2;
            if(isPossible(nums,k,mid)){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}