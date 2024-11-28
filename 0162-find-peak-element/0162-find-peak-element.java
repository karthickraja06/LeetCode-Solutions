class Solution {
    public int findPeakElement(int[] nums) {
        int l = 1,h = nums.length - 1;
        if(h == 0) return 0;
        if(nums[0] > nums[1])return 0;
        if(nums[h] > nums[h - 1])return h;
        h--;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(nums[mid] > nums[mid - 1]){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }
}