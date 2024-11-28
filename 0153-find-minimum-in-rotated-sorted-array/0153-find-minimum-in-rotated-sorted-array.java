class Solution {
    public int findMin(int[] nums) {
        int l = 0,h = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] < ans){
                ans = nums[mid];
            }
            if(nums[mid] <= nums[h]){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}