class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = n + m - 1;
        while(m > 0 && n > 0){
            if(nums1[m-1] == nums2[n-1]){
                nums1[k--] = nums1[m-- -1];
                nums1[k--] = nums2[n-- -1];
            }else if(nums1[m-1] > nums2[n-1]){
                nums1[k--] = nums1[m-- - 1];
            }else{
                nums1[k--] = nums2[n-- - 1];
            }
        }
        if(m == 0){
            for(int i = 0; i < n;i++){
                nums1[i] = nums2[i];
            }
        }
    }
}