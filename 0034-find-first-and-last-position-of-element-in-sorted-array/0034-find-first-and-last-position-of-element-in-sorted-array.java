class Solution {
    public int upperBound(int[] a,int k){
        int l = 0, h = a.length-1;
        int ans = -1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(a[mid] <= k){
                ans = mid;
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return (ans != -1 && a[ans] == k)?ans: -1;
    }
    public int lowerBound(int[] a,int k){
        int l = 0, h = a.length-1;
        int ans = -1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(a[mid] >= k){
                ans = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return (ans != -1 && a[ans] == k)?ans: -1;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length <1) return new int[]{-1,-1};
        return new int[]{lowerBound(nums,target),upperBound(nums,target)};
    }
}