class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length-1;
        if(n <= 1) return nums[0];       
        if(nums[0] != nums[1])return nums[0];
        if(nums[n] != nums[n-1])return nums[n];
        int l = 1, h = n - 1;

        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
            else if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])){ 
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }
}