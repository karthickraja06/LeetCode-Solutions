class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(k < arr[0])return k;
        int l = 0,h = arr.length-1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(arr[mid] - (mid+1) >= k){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return arr[h] + (k - (arr[h] - (h + 1)));
    }
}