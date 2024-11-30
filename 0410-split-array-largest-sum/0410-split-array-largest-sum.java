class Solution {
    public int[] maxAndSumFunc(int[] arr){
        int sum = 0,max = -1;
        for(int i:arr){
            sum += i;
            max = Math.max(max,i);
        }
        return new int[]{max,sum};
    }
    public boolean isPossible(int[] arr,int mid,int k){
        int cnt = 1,subSum = 0;
        for(int i:arr){
            if(subSum + i <= mid){
                subSum += i;
            }else{
                cnt++;
                subSum = i;
            }
        }
        return (cnt <= k);
    }
    public int splitArray(int[] nums, int k) {
        int[] maxAndSum = maxAndSumFunc(nums);
        int l = maxAndSum[0],h = maxAndSum[1];
        while (l <= h) {
            int mid = (l + h) / 2;
            if(isPossible(nums,mid,k)){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}