class Solution {
    public int max(int[] arr){
        int maxi = -1;
        for(int i:arr)
            maxi = Math.max(i,maxi);
        return maxi;
    }
    public boolean ceilSum(int[] arr,double div,double t){
        double sum = 0;
        for(double i:arr)
            sum += Math.ceil(i/div); 
        return (sum <= t);
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1,h = max(nums);
        while(l <= h){
            int mid = (l + h) / 2;
            if(ceilSum(nums,mid,threshold)){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }   
}